package com.driver;

// Subtask 1: Class Hierarchy - Vehicle -> Car -> F1

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class F1 extends Car {
    void race() {
        System.out.println("F1 car is racing");
    }
}

// Subtask 2: WaterVehicle interface and Boat class

interface WaterVehicle {
    String getVehicleName();
    int getVehicleCapacity();
}

class Boat implements WaterVehicle {
    String name;
    int capacity;

    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementing interface methods
    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}

// Main driver code
public class Main {
    public static void main(String[] args) {

        // Subtask 1 Testing
        F1 myF1 = new F1();
        myF1.start();   // from Vehicle
        myF1.drive();   // from Car
        myF1.race();    // from F1

        // Subtask 2 Testing
        Boat myBoat = new Boat("Sea Explorer", 15);
        System.out.println("Boat name: " + myBoat.getVehicleName());
        System.out.println("Boat capacity: " + myBoat.getVehicleCapacity());
    }
}
