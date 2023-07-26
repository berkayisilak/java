package Collection.InsuranceManagement;

public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPrice() * 1.05;
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
}
