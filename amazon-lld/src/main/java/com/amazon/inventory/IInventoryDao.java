package com.amazon.inventory;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

import java.util.List;

public interface IInventoryDao {
    public void add(Product product, Vendor vendor);

    public void remove(Product product, Vendor vendor);

    public void edit(Product product, Vendor vendor);

    public boolean checkStock(Product products);

    public void getProductDetails(Product product);
}
