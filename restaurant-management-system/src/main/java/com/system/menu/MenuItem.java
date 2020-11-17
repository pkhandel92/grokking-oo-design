package com.system.menu;


import com.system.menu.component.MenuComponent;

import java.util.Iterator;

/**
 * This class will be a leaf in composite
 * pattern.
 */
public class MenuItem extends MenuComponent{
    private double price;
    private String description;
    private String name;
    private boolean isVeg;
    private Iterator<MenuComponent> itemIterator;
    public MenuItem(double price, String description, String name, boolean isVeg) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.isVeg = isVeg;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Price "+getPrice());
        System.out.println("Description "+getDescription());
        System.out.println("Name "+getName());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if(itemIterator==null)
            itemIterator= new NullIterator();
        return itemIterator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }
}
