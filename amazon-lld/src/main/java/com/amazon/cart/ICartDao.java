package com.amazon.cart;

import com.amazon.account.User;
import com.amazon.account.Vendor;
import com.amazon.item.Product;

import java.util.List;

public interface ICartDao {
    public void add(Product product, Vendor vendor);

    public void remove(Product product, Vendor vendor);

    public List<Product> fetchCart(User user);

    public void editCart(Product product, User user, int quantity);
}
