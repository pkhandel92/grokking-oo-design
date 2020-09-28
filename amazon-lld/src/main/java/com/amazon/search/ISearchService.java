package com.amazon.search;

import java.util.List;

import com.amazon.account.Vendor;
import com.amazon.item.Product;

public interface ISearchService {

  /*
   * Filtering products using multiple filters should be a common case.
   *
   * An alternative to the following code could be to have only one search method, which accepts a data class /
   * predicate, the data class could be a builder; which will be built after taking in all the params, or the predicate
   * could be a composite predicate, in case of predicates, a helper class could be used with methods to add a new
   * predicate.
   *
   */

  List<Product> searchByAvailability(String location);

  List<Product> searchByCategory(String category);

  Product searchByProductName(String productName);

  List<Product> searchByVendor(Vendor vendor);
}
