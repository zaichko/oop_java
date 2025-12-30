public class Bus extends Vehicle{

    private int seats;
    private boolean isArticulated;

    // Constructor
    public Bus(String brand, int year, int seats, boolean isArticulated){
        super(brand, year);
        this.seats = seats;
        this.isArticulated = isArticulated;
    }

    // Override methods
    public void startEngine(){
        System.out.println("Bus engine started.");
    }
    public void stopEngine(){
        System.out.println("Bus engine stopped.");
    }

}
