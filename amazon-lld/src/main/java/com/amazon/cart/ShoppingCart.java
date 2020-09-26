package com.amazon.cart;

import com.amazon.account.User;
import com.amazon.account.Vendor;
import com.amazon.inventory.IInventoryService;
import com.amazon.item.Product;

import java.util.List;

public class ShoppingCart implements IShoppingCart{
    private ICartDao dao;
    private IInventoryService inventoryService;
    @Override
    public void addToCart(Product product, Vendor vendor) {
        if(inventoryService.checkStock(product))
            dao.add(product,vendor);
        else{
            //do something
        }
    }

    @Override
    public void removeFromCart(Product product, Vendor vendor) {
        dao.remove(product,vendor);
    }

    @Override
    public List<Product> viewCart(User user) {
        return dao.fetchCart(user);
    }

    @Override
    public void editCart(Product product, User user, int quantity) {
        dao.editCart(product,user,quantity);
    }

}
