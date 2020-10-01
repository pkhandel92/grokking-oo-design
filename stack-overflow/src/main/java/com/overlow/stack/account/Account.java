package com.overlow.stack.account;



public abstract class Account {
  
  /*
   * #resetPassword(String newPassword) is a service method. It should not exist in the class with data fields.
   * It's breaking single responsibility principal.
   */
  
    private String name;
    private String address;
    private String email;
    private String userId;
    public abstract boolean resetPassword(String newPassword);
}
