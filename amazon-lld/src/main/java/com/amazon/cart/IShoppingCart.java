package com.amazon.cart;

import com.amazon.account.User;
import com.amazon.account.Vendor;
import com.amazon.item.Product;

import java.util.List;

public interface IShoppingCart {
    public void addToCart(Product product, Vendor vendor);
    public void removeFromCart(Product product,Vendor vendor);
    public List<Product> viewCart(User user);
    public void editCart(Product product,User user,int quantity);
}
