package FundamentalsOOPInterface;

public class Employee {
    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Employee(String nameSurname, String phoneNumber, String email) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this. email = email;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry() {
        System.out.println(this.getNameSurname() + " üniversiteye giriş yaptı");
    }

    public void exit() {
        System.out.println(this.getNameSurname() + " üniversiteden çıkış yaptı");
    }

    public void refectory() {
        System.out.println(this.getNameSurname() + " yemekhaneye giriş yaptı");
    }
}
