package Collection.PatikaStore;

public class MobilePhone extends Brand{
    private int id;
    private double price;
    private double discountRate;
    private int amount;
    private String name;
    private int storage;
    private double screen;
    private int camera;
    private double battery;
    private int ram;
    private String color;

    public MobilePhone(String brandName, int brandID, int id, double price, double discountRate, int amount, String name, int storage, double screen, int camera, double battery, int ram, String color) {
        super(brandID, brandName);
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.name = name;
        this.storage = storage;
        this.screen = screen;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
