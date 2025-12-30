public class Driver{
    private String name;
    private String licenceNumber;

    public Driver(String name, String licenceNumber){
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    public void displayDriverInfo(){
        System.out.println("Name: " + name + "\n Licence number: " + licenceNumber);
    }
}
