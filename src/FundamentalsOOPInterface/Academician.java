package FundamentalsOOPInterface;

public class Academician extends Employee{
    private String department;
    private String degree;

    public Academician(String nameSurname, String phoneNumber, String email, String department, String degree) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void attendClass() {
        System.out.println(this.getNameSurname() + " derse girdi");
    }
}
