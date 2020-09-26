package library.mgmt.membership;

import library.mgmt.account.IAccount;

public class MembershipService implements IMembershipService{
    /**
     * To mock to create a membership
     * can be used to create membership for
     * librarian/author
     * @param account
     * @return
     */
    public boolean createMemberShip(IAccount account) {

        return false;
    }

    public boolean cancelMemberShip(IAccount account) {
        return false;
    }

    public boolean editMembership(IAccount account) {
        return false;
    }
}
