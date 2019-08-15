package com.star.controller;


import com.star.entity.Menu;
import com.star.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/client")
public class clientController {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/findallmenu")
    public Collection<Menu> findAllMenu(){
        return menuFeign.findAllMenu();
    }
}
