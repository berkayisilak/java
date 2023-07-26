package Collection.InsuranceManagement;

import java.time.LocalDate;

public class CarInsurance extends Insurance{
    private String carMake;
    private String carModel;
    private int carAge;
    private boolean coverageForDrivers;
    private boolean coverageForPassengers;

    public CarInsurance(String carMake, String carModel, int carAge, boolean coverageForDrivers, boolean coverageForPassengers) {
        super("Car Insurance", 800, LocalDate.now(), LocalDate.now().plusWeeks(3));
        this.carMake = carMake;
        this.carModel = carModel;
        this.carAge = carAge;
        this.coverageForDrivers = coverageForDrivers;
        this.coverageForPassengers = coverageForPassengers;
    }

    @Override
    public void calculate() {
        double basePrice = getPrice();
        double premium = basePrice;
        if (this.carAge > 5) {
            premium += (basePrice * 0.03);
        }
        if (this.coverageForDrivers && coverageForPassengers) {
            premium += (basePrice * 0.02);
        }
        setPrice(premium);
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public boolean isCoverageForDrivers() {
        return coverageForDrivers;
    }

    public void setCoverageForDrivers(boolean coverageForDrivers) {
        this.coverageForDrivers = coverageForDrivers;
    }

    public boolean isCoverageForPassengers() {
        return coverageForPassengers;
    }

    public void setCoverageForPassengers(boolean coverageForPassengers) {
        this.coverageForPassengers = coverageForPassengers;
    }
}
