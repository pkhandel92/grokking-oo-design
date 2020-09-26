package library.mgmt.membership;

import library.mgmt.account.IAccount;

public interface IMembershipService {
    public boolean createMemberShip(IAccount account);
    public boolean cancelMemberShip(IAccount account);
    public boolean editMembership(IAccount account);
}
