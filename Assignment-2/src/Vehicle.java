public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    // Constructor
    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    // Setters and getters
    public void setDriver(Driver driver){
        this.driver = driver;
    }

    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();

    // Concrete methods
    public void displayInfo(){
        System.out.println("Brand: " + brand + "\n" + "Year: " + year);
    }
    public void displayDriverInfo(){
        if (driver != null){
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned.");
        }
    }
}
