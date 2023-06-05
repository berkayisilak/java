package FundamentalsOOPInterface;

public class Officer extends Employee {
    private String department;
    private String shift;

    public Officer(String nameSurname, String phoneNumber, String email, String department, String shift) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " memur çalışmaya başladı.");
    }


}
