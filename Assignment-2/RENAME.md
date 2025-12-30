# Vehicle Management System (Assignment 2)
## Project Overview

This project implements a Vehicle Management System designed to demonstrate core Object-Oriented Programming (OOP) principles in Java.

The system models different types of vehicles using inheritance and abstraction, associates them with drivers using composition and aggregation, and processes them polymorphically through a common superclass.

#### The project focuses on:

Abstract classes and method overriding

Superclass–subclass relationships

Constructor chaining using super

Encapsulation with access modifiers

Safe object interaction and null handling

Polymorphism via arrays of superclass types

## Class Hierarchy and Design
### Abstract Superclass: Vehicle

Vehicle is an abstract class that represents the general concept of a vehicle.

#### Fields:

brand (String)

year (int)

driver (Driver)

#### Key features:

Declares abstract methods startEngine() and stopEngine()

Implements a concrete method displayInfo() shared by all vehicles

Encapsulates driver-related logic with displayDriverInfo() to ensure null-safe behavior

This design ensures that all subclasses share common structure while providing their own specific behavior.

### Subclasses of Vehicle

Each subclass extends Vehicle and overrides its abstract methods.

#### Car

Additional fields: doors, fuelType

Represents passenger cars with customized engine behavior

#### Motorcycle

Additional field: hasSidecar

Represents two-wheeled vehicles with optional sidecar

#### Truck

Additional fields: capacity, numAxles

Represents heavy-duty vehicles

#### Bus (Bonus class)

Additional fields: seats, isArticulated

Demonstrates extensibility of the class hierarchy

All subclasses use constructor chaining via super(brand, year) and override engine-related methods.

### Driver Class and Object Relationships
#### Driver Class

Represents a driver with:

name

licenceNumber

Includes a method displayDriverInfo() to output driver details.

#### Composition and Aggregation

Composition:
Each Vehicle object holds a reference to a Driver, meaning a vehicle has a driver.

Aggregation:
A single Driver object may be associated with multiple Vehicle objects, and drivers exist independently of vehicles.

Driver assignment is handled through a setter method, and all driver-related output is encapsulated within the Vehicle class to prevent null reference errors.

## Main Program Logic

### The Main class:

Creates multiple vehicle objects of different subclasses

Creates driver objects

Assigns drivers to selected vehicles

Stores all vehicles in an array of type Vehicle

Iterates through the array and calls methods polymorphically:

startEngine()

displayInfo()

stopEngine()

displayDriverInfo()

This demonstrates polymorphism, as method calls are resolved at runtime based on the actual object type.

## How to Compile and Run

From the src directory:

javac *.java
java Main

## Screenshots

### Screenshots of the program output demonstrating:

#### Correct engine behavior for different vehicles

![full_program_output.png](Assignment-2/docs/screenshots/full_program_output.png)

#### Proper driver association and null-safe handling

![driver_assosiation.png](Assignment-2/docs/screenshots/driver_assosiation.png)
![null_value_handling.png](Assignment-2/docs/screenshots/null_value_handling.png)

(See docs/screenshots/)

## Reflection

Inheritance significantly simplified the design by allowing shared fields and behavior to be defined once in the abstract Vehicle class. This reduced code duplication and made it easy to extend the system by adding new vehicle types, such as the Bus class.

Method overriding enabled each subclass to provide its own implementation of engine behavior while maintaining a common interface. One challenge encountered was handling driver associations safely; this was resolved by encapsulating driver-related logic inside the Vehicle class, preventing NullPointerException and improving robustness. The use of protected and private access modifiers helped balance accessibility and encapsulation throughout the system.

## Conclusion

This project successfully demonstrates inheritance, abstraction, composition, aggregation, and polymorphism in Java. The system is designed to be extensible, readable, and safe, following clean OOP principles and meeting all assignment requirements.
