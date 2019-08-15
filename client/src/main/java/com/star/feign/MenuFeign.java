package com.star.feign;


import com.star.entity.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findallmenu/")
    Collection<Menu> findAllMenu();
}
