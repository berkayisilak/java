package Collection.InsuranceManagement;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insuranceList;

    enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }


    public Account(User user) {
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.user = user;
        this.insuranceList = new ArrayList<Insurance>();
    }

    public abstract void addInsurance(Insurance insurance);


    public void login(String email, String password) {
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            this.authenticationStatus = AuthenticationStatus.FAIL;
        }
    }

    public final void showUserInfo() {
        System.out.println("Ad: " + this.user.getName());
        System.out.println("Soyad: " + this.user.getSurname());
        System.out.println("Email: " + this.user.getEmail());
        System.out.println("Password: " + this.user.getPassword());
        System.out.println("Meslek: " + this.user.getJob());
        System.out.println("Yaş: " + this.user.getAge());
        System.out.println("Adres: " + this.user.getAddresses());
        System.out.println("Son giriş tarihi: " + this.user.getLastLogin());
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(ArrayList<Insurance> insuranceList) {
        this.insuranceList = insuranceList;
    }
}
