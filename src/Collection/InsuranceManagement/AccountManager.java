package Collection.InsuranceManagement;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accountList;

    public AccountManager() {
        accountList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public Account login(String email, String password) {
        for (Account account : this.accountList) {
            try {
                account.login(email, password);
                if (account.getAuthenticationStatus().equals(Account.AuthenticationStatus.SUCCESS)) {
                    account.showUserInfo();
                    return account;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public TreeSet<Account> getAccountList() {
        return this.accountList;
    }

}
