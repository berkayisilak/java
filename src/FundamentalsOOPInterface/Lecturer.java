package FundamentalsOOPInterface;

public class Lecturer extends Academician {
    private int kapiNo;

    public Lecturer(String nameSurname, String phoneNumber, String email, String department, String degree, int kapiNo) {
        super(nameSurname, phoneNumber, email, department, degree);
        this.kapiNo = kapiNo;
    }

    public int getKapiNo() {
        return this.kapiNo;
    }

    public void setKapiNo(int kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void meeting() {
        System.out.println(this.getNameSurname() + " toplantı yapıyor");
    }

    public void exam() {
        System.out.println(this.getNameSurname() + " sınav yapıyor");
    }
}
