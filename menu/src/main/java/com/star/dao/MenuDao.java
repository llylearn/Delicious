package com.star.dao;

import com.star.entity.Menu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

public interface MenuDao {
    @Select("select * from Menu")
    Collection<Menu> findAllMenu();

    @Select("select * from Menu where name=#{name}")
    Menu findMenuByName(String name);

    @Insert("inset into Menu(name, price) values(#{name}, #{price})")
    void insertMenu(Menu menu);

    @Delete("delete from Menu where mid=#{mid}")
    void deleteMenuByMid(int mid);
}
