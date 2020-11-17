package com.system.menu.component;

import java.util.Iterator;

public abstract class MenuComponent {
    public abstract Iterator<MenuComponent> createIterator();
    public abstract String getName();
    public  abstract String getDescription();
    public  double getPrice(){
        throw new UnsupportedOperationException();
    }
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void get(int i){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public abstract void print();
}
