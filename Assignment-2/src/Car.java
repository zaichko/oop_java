public class Car extends Vehicle {

    private int doors;
    private String fuelType;

    // Constructor
    public Car(String brand, int year, int doors, String fuelType){
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }


    // Override methods
    public void startEngine(){
        System.out.println("Car engine started.");
    }

    public void stopEngine(){
        System.out.println("Car engine stopped.");
    }

}
