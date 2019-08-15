package com.star.service;

import com.star.dao.MenuDao;
import com.star.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MenuService {
    @Autowired
    MenuDao menuDao;

    public Collection<Menu> findAllMenu(){ return menuDao.findAllMenu();}

    public Menu findMenuByName(String name){ return menuDao.findMenuByName(name);}

    public void insertMenu(Menu menu){ menuDao.insertMenu(menu);}

    public void deleteMenuByMid(int mid){ menuDao.deleteMenuByMid(mid);}
}
