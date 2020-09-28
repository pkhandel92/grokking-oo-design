package com.amazon.inventory;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

public interface IInventoryDao {

  /* The data class Product already contains Vendor details, maybe the second parameter could be removed */

  void add(Product product, Vendor vendor);

  boolean checkStock(Product products);

  void edit(Product product, Vendor vendor);

  void getProductDetails(Product product);

  void remove(Product product, Vendor vendor);
}
