package com.amazon.inventory;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

import java.util.List;

public interface IInventoryService {
    public void addProduct(Product product, Vendor vendor);
    public void removeProduct(Product product, Vendor vendor);
    public void updateQuantity(Product product,Vendor vendor);
    public boolean checkStock(Product product);
}
