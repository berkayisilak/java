package Collection.InsuranceManagement;

public class Enterprise extends Account{
    private String companyName;
    public Enterprise(User user, String companyName) {
        super(user);
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.01;
        insurance.setPrice(price);
        super.getInsuranceList().add(insurance);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
