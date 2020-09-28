package com.amazon.inventory;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

public interface IInventoryService {

  /*
   * The data class Product already contains Vendor details, maybe the second parameter could be removed
   */
  void addProduct(Product product, Vendor vendor);

  boolean checkStock(Product product);

  /*
   * Vendor might not be required to remove product.
   */
  void removeProduct(Product product, Vendor vendor);

  /*
   * Vendor might not be required to update quantity
   */
  void updateQuantity(Product product, Vendor vendor);
}
