package FundamentalsOOPInterface;

public class LabAssistant extends Assistant {

    public LabAssistant(String nameSurname, String phoneNumber, String email, String department, String degree, double officeTime) {
        super(nameSurname, phoneNumber, email, department, degree, officeTime);
    }

    public void lab() {
        System.out.println(this.getNameSurname() + " lab dersi yapıyor");
    }
}
