package Collection.InsuranceManagement;

public class BusinessAddress implements Address {
    private String street;
    private String city;
    private String country;
    private String postalCode;
    private String companyName;

    public BusinessAddress(String street, String city, String country, String postalCode, String companyName) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.companyName = companyName;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
