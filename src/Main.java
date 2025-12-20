public class Main{
    public static void main(String[] args){
        // Creating students
        Student s1 = new Student("Liam Hill", "001", "Computer Science");
        s1.updateGpa(3.54);
        s1.addCredits(70);
        Student s2 = new Student("Simon Milner", "002", "Electrical Engineering");
        s2.updateGpa(2.68);
        s2.addCredits(50);
        Student s3 = new Student("Jessie Brown", "003", "Cybersecurity");
        s3.updateGpa(2.57);
        s3.addCredits(90);
        Student s4 = new Student("David Stone", "004", "Software Engineering");
        s4.updateGpa(3.61);
        s4.addCredits(65);
        Student s5 = new Student("Chloe Frost", "005", "Digital Journalism");
        s5.updateGpa(3.25);
        s5.addCredits(72);

        // Print students' details
        System.out.println(s1.toString() + "\n" +
                s2.toString() + "\n" +
                s3.toString() + "\n" +
                s4.toString() + "\n" +
                s5.toString());

        // Creating courses
        int maxStudents = 5;
        Course c1 = new Course("Calculus", "Kevin Evans", maxStudents);

        // Insert students
        c1.addStudent(s1, 0);
        c1.addStudent(s2, 1);
        c1.addStudent(s3, 2);
        c1.addStudent(s4,3);

        // Printing course details
        System.out.println(c1.toString() + "\n");

        //Printing the highest-credit student and average GPA
        Student sHighCredit = c1.highestCreditStudent();
        System.out.println(String.format(
                "Highest-credit student: %s, %d credits",
                sHighCredit.getName(),
                sHighCredit.getCredits()));

        System.out.println("Average GPA: " + c1.courseAverageGPA());

        // Creating an array of students
        Student[] array = {s1, s2, s3, s4, s5};

        Student top = getTopStudent(array);
        int honors = countHonors(array);
        int totalCredits = countCredits(array);
        System.out.println(String.format(
                "Top student: %s %nHonors: %d %nTotal credits: %d", top.getName(), honors, totalCredits));
    }

    // Static methods
// Get top student method
    static Student getTopStudent(Student[] array){
        Student topStudent = array[0];
        for (Student s : array){
            if(s.getGpa() > topStudent.getGpa()){
                topStudent = s;
            }
        }
        return topStudent;
    }

    // Count honor students method
    static int countHonors(Student[] array){
        int count = 0;
        for(Student s : array){
            if (s.isHonors()){
                count++;
            }
        }
        return count;
    }

    // Total credits count method
    static int countCredits(Student[] array){
        int count = 0;
        for (Student s : array){
            count += s.getCredits();
        }
        return count;
    }
}