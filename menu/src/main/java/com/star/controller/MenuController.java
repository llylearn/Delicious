package com.star.controller;

import com.star.entity.Menu;
import com.star.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String getPort() {
        return port;
    }

    @GetMapping("/findallmenu")
    public Collection<Menu> findAllMenu(){
       return menuService.findAllMenu();
    }
}
