package com.amazon.inventory;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

public class InventoryService implements IInventoryService{
    private IInventoryDao inventoryDao;
    @Override
    public void addProduct(Product product, Vendor vendor) {
        inventoryDao.add(product,vendor);
    }

    @Override
    public void removeProduct(Product product, Vendor vendor) {
        inventoryDao.remove(product,vendor);
    }

    @Override
    public void updateQuantity(Product product, Vendor vendor) {
        inventoryDao.edit(product,vendor);
    }

    @Override
    public boolean checkStock(Product product) {
        return inventoryDao.checkStock(product);
    }
}
