package com.amazon.search;

import com.amazon.item.Product;
import com.amazon.account.Vendor;

import java.util.List;

public interface ISearchService {
    public Product searchByProductName(String productName);
    public List<Product> searchByCategory(String category);
    public List<Product> searchByAvailability(String location);
    public List<Product> searchByVendor(Vendor vendor);
}
