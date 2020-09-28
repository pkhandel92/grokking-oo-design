package com.amazon.item;

import java.util.List;

import com.amazon.account.Vendor;

class Company {

  private String companyName;
  private String tin;
  /*
   * This is already a field in product class. Users will filter products based on type; and they will filter products
   * based on company. But they will never filter a company based on products manufactured.
   *
   */
  private List<Type> productsManufactured;
  /*
   * Having a list of vendors inside company doesn't add any benefit in context to the problem. It's a many to many
   * relationship in most of the cases, unless a company has exclusive vendor, or the company is the vendor as well.
   *
   * In my opinion, it's better to have a data class which represents the relationship between company and vendor, and
   * use it in the very specific cases it's required.
   *
   */
  private List<Vendor> vendors;

  public String getCompanyName() {
    return companyName;
  }

  public List<Type> getProductsManufactured() {
    return productsManufactured;
  }

  public String getTin() {
    return tin;
  }

  public List<Vendor> getVendors() {
    return vendors;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setProductsManufactured(List<Type> productsManufactured) {
    this.productsManufactured = productsManufactured;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }

  public void setVendors(List<Vendor> vendors) {
    this.vendors = vendors;
  }

}

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

  public Company getCompany() {
    return company;
  }

  public double getDiscount() {
    return discount;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public List<Type> getType() {
    return type;
  }

  public Vendor getVendor() {
    return vendor;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setType(List<Type> type) {
    this.type = type;
  }

  public void setVendor(Vendor vendor) {
    this.vendor = vendor;
  }
}

enum Type {
  BOOK, HOUSEHOLD, VEGETABLE, SPORT, CLOTHES, COSMETICS;
  /**
   * Can be other products
   */
}
