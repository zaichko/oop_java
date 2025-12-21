public class Student {
    // Private fields
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    // Constructor
    public Student(String name, String id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // Getters and setters
    // For name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // For id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    //For major
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }

    //For gpa
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        if(0.0 <= gpa && gpa <= 4.0){
            this.gpa = gpa;
        }
    }

    //For "credits"
    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    // Data update methods
    public void addCredits(int c){
        this.credits += c;
    }
    public void updateGpa(double newGPA){
        setGpa(newGPA);
    }

    // Honors determination
    private static final double honorsGpa = 3.5;
    public boolean isHonors(){
        return this.gpa >= honorsGpa;
    }

    // Textual representation of a student
    public String toString(){
        return String.format(
                "Full name: %s. %nID: %s. %nMajor: %s. %nGPA: %.1f. %nCredits: %d.%n",
                name,
                id,
                major,
                gpa,
                credits);
    }
}
