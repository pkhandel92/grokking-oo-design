package com.amazon.item;

import com.amazon.account.Vendor;

import java.util.List;

public class Product {
    private String name;
    private List<Type> type;
    private Company company;
    private Vendor vendor;
    private double price;
    private double discount;
    public Product(String name, List<Type> type, Company company, Vendor vendor) {
        this.name = name;
        this.type = type;
        this.company = company;
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getType() {
        return type;
    }

    public void setType(List<Type> type) {
        this.type = type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
enum Type{
    BOOK,
    HOUSEHOLD,
    VEGETABLE,
    SPORT,
    CLOTHES,
    COSMETICS;
    /**
     * Can be other products
     */
}
class Company{
    private String companyName;
    private String tin;
    private List<Type> productsManufactured;
    private List<Vendor> vendors;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public List<Type> getProductsManufactured() {
        return productsManufactured;
    }

    public void setProductsManufactured(List<Type> productsManufactured) {
        this.productsManufactured = productsManufactured;
    }

    public List<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
    }

}
