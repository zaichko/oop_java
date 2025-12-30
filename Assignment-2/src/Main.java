public class Main{

    public static void main(String[] args){
        // Create objects
        Car car = new Car("Toyota", 2020, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", 2019, false);
        Truck truck = new Truck("Volvo", 2018, 10.5, 6);
        Bus bus = new Bus("Yutong", 2017, 50, false);

        //Create Driver objects
        Driver driver1 = new Driver("Alice", "LIC123");
        Driver driver2 = new Driver("Bob", "LIC456");

        // Assign drivers
        car.setDriver(driver1);
        bike.setDriver(driver2);
        truck.setDriver(driver1);

        // Array of Vehicle objects
        Vehicle[] vehicles = { car, bike, truck, bus };

        for (Vehicle v : vehicles){
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            v.displayDriverInfo();
            System.out.println("----------------------");
        }
    }

}