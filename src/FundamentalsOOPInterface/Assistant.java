package FundamentalsOOPInterface;

public class Assistant extends Academician {
    private double officeTime;

    public Assistant(String nameSurname, String phoneNumber, String email, String department, String degree, double officeTime) {
        super(nameSurname, phoneNumber, email, department, degree);
        this.officeTime = officeTime;
    }

    public double getOfficeTime() {
        return this.officeTime;
    }

    public void setOfficeTime(double officeTime) {
        this.officeTime = officeTime;
    }

    public void quiz() {
        System.out.println(this.getNameSurname() + " quiz yapıyor");
    }
}
