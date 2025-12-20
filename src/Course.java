public class Course {
    //Private fields
    private String courseName;
    private String instructor;
    private Student[] students;

    // Constructor
    public Course(String courseName, String instructor, int arraySize){
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[arraySize];
    }

    // Insert students into an array method
    public void addStudent(Student student, int index){
        if(index >= 0 && index < students.length){
            students[index] = student;
        }
        else {
            System.out.println("Invalid index.");
        }
    }

    // Compute course average GPA method
    public double courseAverageGPA(){
        double sum_gpa = 0;
        int count = 0;
        for (Student student : students) {
            if(student != null){
                sum_gpa += student.getGpa();
                count++;
            }
        }
        return count == 0 ? 0.0 : sum_gpa / count;
    }

    // Find student with max credits method
    public Student highestCreditStudent(){
        Student max = null;
        for (Student student : students){
            if(student != null && (max == null || student.getCredits() > max.getCredits())){
                max = student;
            }
        }
        return max;
    }

    // Course summary
    public String toString(){
        StringBuilder names = new StringBuilder();

        for(Student s : students){
            if(s != null){
                names.append(s.getName()).append(", ");
            }
        }

        if (!names.isEmpty()){
            names.setLength(names.length() - 2);
        }
        return String.format(
                "Course name: %s. %nInstructor: %s. %nStudents: %s.",
                courseName,
                instructor,
                names);
    }
}
