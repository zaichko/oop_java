# Java OOP Assignments

This repository contains two Java assignments demonstrating fundamental and advanced Object-Oriented Programming concepts.

## Assignment 1: Object-Oriented Student Management System

The first assignment implements a simple Student Management System. It models students and courses and demonstrates core Java and OOP concepts, including encapsulation, abstraction, composition, constructors, methods, arrays of objects, and data validation.

The system consists of three main classes:

- `Student` encapsulates student information such as name, ID, major, GPA, and earned credits. It provides validated getters and setters, methods for updating GPA and credits, an honors-status check, and a formatted `toString()`.
- `Course` represents a course and contains an array of `Student` objects. It supports adding students, calculating the average GPA, finding the student with the most credits, and displaying course information.
- `Main` demonstrates the functionality of the system.

The assignment particularly demonstrates how objects can be composed into larger structures while keeping their internal state protected through private fields and controlled access.

### Running Assignment 1

From the "src" directory:

```
javac *.java
java Main
```

Program output demonstrates student information, course summaries, GPA calculations, honors students, and credit totals.

Screenshots are available in `docs/screenshots/`.

## Assignment 2: Vehicle Management System

The second assignment implements a Vehicle Management System focused on inheritance, abstraction, polymorphism, and object relationships.

The main class hierarchy is based on the abstract `Vehicle` class:

```
Vehicle
├── Car
├── Motorcycle
├── Truck
└── Bus
```

`Vehicle` contains common fields such as brand, year, and driver. It declares the abstract methods `startEngine()` and `stopEngine()`, while providing shared functionality such as displaying vehicle information and handling driver information safely.

Each subclass extends `Vehicle` and provides its own implementation of the engine-related methods. The subclasses also contain type-specific fields, such as the number of doors for `Car`, sidecar availability for `Motorcycle`, capacity and axle count for `Truck`, and seating and articulation information for `Bus`.

The `Driver` class represents drivers independently from vehicles. A vehicle can reference a driver, while the same driver can be associated with multiple vehicles. This demonstrates composition and aggregation in the object model.

The `Main` class creates different vehicle and driver objects, assigns drivers, stores the vehicles in a `Vehicle[]` array, and processes them through the common superclass interface. Calls to `startEngine()`, `displayInfo()`, and `stopEngine()` demonstrate runtime polymorphism.

Driver-related operations are handled with null-safe logic to prevent `NullPointerException` when a vehicle has no assigned driver.

### Running Assignment 2

From the "src" directory:

```
javac *.java
java Main
```

Program output demonstrates different engine behaviors, vehicle information, driver associations, and safe handling of vehicles without drivers.

Screenshots are available in `docs/screenshots/`.

## Concepts Demonstrated

Together, the assignments cover:

- Encapsulation and data hiding
- Abstraction
- Inheritance
- Polymorphism
- Method overriding
- Constructor chaining with "super"
- Composition
- Aggregation
- Arrays of objects
- Access modifiers
- Input validation
- Null-safe object interaction
- Basic data processing with Java methods

## Repository Structure

```
.
├── Assignment 1/
│   ├── src/
│   └── docs/
│       └── screenshots/
│
└── Assignment 2/
    ├── src/
    └── docs/
        └── screenshots/
```