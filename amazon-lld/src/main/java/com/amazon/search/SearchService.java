package com.amazon.search;

import com.amazon.item.Product;
import com.amazon.account.Vendor;

import java.util.ArrayList;
import java.util.List;

public class SearchService implements ISearchService{
    private ISearchDao searchDao;
    @Override
    public Product searchByProductName(String productName) {
        if(productName!=null&&!productName.isEmpty())
        return searchDao.searchByProductName(productName);
        else{
            //throw error
            return null;
        }
    }

    @Override
    public List<Product> searchByCategory(String category) {
        if(category==null||category.isEmpty())
            return new ArrayList<Product>();
        return searchDao.searchByCategory(category);
    }

    @Override
    public List<Product> searchByAvailability(String location) {
        return searchDao.searchByAvailability(location);
    }
    public List<Product> searchByVendor(Vendor vendor){
        return searchDao.searchByVendor(vendor);
    }
}
