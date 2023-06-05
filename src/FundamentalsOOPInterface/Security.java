package FundamentalsOOPInterface;

public class Security extends Officer{
    private String document;

    public Security(String nameSurname, String phoneNumber, String email, String department, String shift, String document) {
        super(nameSurname, phoneNumber, email,department, shift);
        this.document = document;
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void watch() {
        System.out.println(this.getNameSurname() + " etrafı izliyor");
    }
}
