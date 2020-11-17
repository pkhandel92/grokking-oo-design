package com.system.menu;

import com.system.menu.component.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack=new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty())
            return false;

        Iterator<MenuComponent> menuComponentIterator=stack.peek();
        if (!menuComponentIterator.hasNext()){
                stack.pop();
                return hasNext();
        }else
        {
            return true;
        }
    }

    @Override
    public MenuComponent next() {
        if (hasNext()){
            Iterator<MenuComponent> iterator=stack.peek();
            MenuComponent menuComponent=iterator.next();
            if(menuComponent instanceof Menu)
                stack.push(menuComponent.createIterator());
                return menuComponent;
        }
        return null;
    }


}
