package com.star.entity;

public class Menu {
    private int mid;
    private String name;
    private int price;

    public Menu(int mid, String name, int price) {
        this.mid = mid;
        this.name = name;
        this.price = price;
    }

    public Menu() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
