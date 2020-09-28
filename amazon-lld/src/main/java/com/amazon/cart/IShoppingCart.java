package com.amazon.cart;

import java.util.List;

import com.amazon.account.User;
import com.amazon.account.Vendor;
import com.amazon.item.Product;

public interface IShoppingCart {

  /*
   * The data class Product already contains Vendor details, maybe the second parameter could be removed
   */
  void addToCart(Product product, Vendor vendor);

  void editCart(Product product, User user, int quantity);

  /*
   * Vendor might not be required to remove product.
   */
  void removeFromCart(Product product, Vendor vendor);

  List<Product> viewCart(User user);
}
