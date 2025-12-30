public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int year, boolean hasSidecar){
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    // Override methods
    public void startEngine(){
        System.out.println("Bike engine started.");
    }

    public void stopEngine(){
        System.out.println("Bike engine stopped.");
    }

}
