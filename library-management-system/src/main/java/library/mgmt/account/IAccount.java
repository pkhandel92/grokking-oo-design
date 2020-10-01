package library.mgmt.account;


/*This interface is a bit confusing.
It's both a service interface and a data interface.
First four methods are service methods, last three are data methods.
In the interface IMembershipService, it is being used as a data interface.
It is duplicating the method in ILogin interface, it is being used as a data interface there as well.
It is breaking interface segregation in my opinion, and any implementation of 
this class will most likely break single responsibility principle.
*/

public interface IAccount {
  
    public boolean login(String uid,CharSequence password);
    public boolean cancelMembership(String uid);
    public boolean changePassword(String uid, CharSequence curPass, CharSequence newPass);
    public boolean scanBarCode();
    public String getName();
    public String getEmail();
    public String getID();
}
