package com.system.menu;

import com.system.menu.component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
    private String name;
    private String description;
    private Iterator<MenuComponent> iterator;
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    List<MenuComponent> menuComponents=new ArrayList<>();
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void get(int i) {
        menuComponents.get(i);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("Menu Name "+getName());
        System.out.println("Menu Description "+getDescription());
        menuComponents.stream().forEach(MenuComponent::print);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if(iterator==null)
            iterator=new CompositeIterator(menuComponents.iterator());
        return iterator;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
