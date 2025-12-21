# Object-Oriented Student Management System (Assignment 1)
## Project Overview

This project implements an Object-Oriented Student Management System using Java. The main goal of the program is to model students and courses while demonstrating core object-oriented programming (OOP) concepts such as encapsulation, abstraction, composition, and data hiding.

The system consists of two main classes: Student and Course, as well as a driver class Main that demonstrates the program’s functionality. Through this project, Java fundamentals such as variables, data types, conditions, loops, arrays, constructors, methods, and access modifiers are applied in a practical context. The project integrates learned topics by using arrays of objects, performing data processing tasks, and enforcing proper state management through getters and setters.

## Class Descriptions
### Student Class

The Student class represents an individual student and encapsulates all student-related data.

### Fields:

name – full name of the student

id – unique student ID

major – academic program

gpa – current grade point average

credits – total earned credits

All fields are declared private to enforce encapsulation.

### Constructor:
The constructor accepts name, id, and major as parameters and initializes gpa to 0.0 and credits to 0, ensuring a valid initial state.

### Methods:

Getters and setters for all fields with input validation

addCredits(int c) – increases earned credits

updateGPA(double newGPA) – updates GPA safely

isHonors() – returns true if GPA is 3.5 or higher

toString() – returns a formatted, human-readable description of the student

### Course Class

The Course class represents an academic course and demonstrates composition, as it contains an array of Student objects.

### Fields:

courseName – name of the course

instructor – instructor’s name

students[] – array of enrolled students

### Constructor:
The constructor initializes the course name, instructor, and the size of the student array.

### Methods:

addStudent(Student s, int index) – adds a student at a specified index with bounds checking

courseAverageGPA() – calculates the average GPA of enrolled students

highestCreditStudent() – returns the student with the highest number of credits

toString() – returns a summary of the course, including enrolled students’ names

This class illustrates how objects can work together while maintaining clear responsibility boundaries.

## Instructions to Compile and Run

Navigate to the src directory containing the .java files.

### Compile the program:

javac *.java


### Run the program:

java Main


The program will output student information, course summaries, calculated GPAs, honors statistics, and total credits.

## Screenshots

Screenshots demonstrating the program output are included in the docs/screenshots/ directory. They also are provided below.
They show:

Printed student details using toString()

<img width="246" height="140" alt="image" src="https://github.com/user-attachments/assets/a57d45f5-63df-431c-ac32-85ccdfdbaf4e" />

Course summary output

<img width="613" height="81" alt="image" src="https://github.com/user-attachments/assets/5861e578-3023-4944-9c8c-1afad5c42a3a" />

Highest GPA student

<img width="255" height="26" alt="image" src="https://github.com/user-attachments/assets/14aeaeb2-78a4-41aa-98b8-cc5d4509ba8a" />

Number of honors students

<img width="113" height="29" alt="image" src="https://github.com/user-attachments/assets/265ca975-f75a-4c2f-961b-fe3f701e0065" />

Total credits calculation

<img width="193" height="24" alt="image" src="https://github.com/user-attachments/assets/855a0fbe-73e7-4070-a798-f701ac5f1ea7" />


These screenshots confirm the correct functionality of the system.

## Reflection

Through this project, I learned how to design a small but complete Java application using object-oriented principles. Implementing encapsulation with private fields and controlled access via getters and setters helped reinforce the importance of protecting an object’s internal state. I also gained practical experience working with arrays of objects and writing methods that perform calculations across multiple instances.

One of the main challenges was handling array boundaries and null values safely, especially when calculating averages or searching for specific students. This project clearly demonstrated the benefits of OOP: the code is more organized, readable, and easier to maintain. Encapsulation and abstraction made the program more robust and flexible, while composition allowed different classes to interact without tightly coupling their implementations.
