package com.amazon.account;

public class Vendor implements IAccount {
    private String name;
    private String address;
    private String vendorId;
    private String accountId;
    private String emailId;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    @Override
    public String getEmailId() {
        return emailId;
    }
}
