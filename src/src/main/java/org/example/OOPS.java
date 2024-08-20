package org.example;

    // Encapsulation
    class Vehicle {
        private String brand;
        private int year;

        public Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        // Method to be overridden by subclasses
        public void startEngine() {
            System.out.println("Vehicle engine is starting...");
        }
    }

    // Inheritance
    class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, int year, int numberOfDoors) {
            super(brand, year); // Call the superclass constructor
            this.numberOfDoors = numberOfDoors;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        public void setNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
        }

        // Polymorphism - Overriding
        @Override
        public void startEngine() {
            System.out.println("Car engine is starting with a roar...");
        }

        // Abstraction
        public void displayDetails() {
            System.out.println("Car Brand: " + getBrand());
            System.out.println("Year: " + getYear());
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }

    class Bike extends Vehicle {
        private boolean hasCarrier;

        public Bike(String brand, int year, boolean hasCarrier) {
            super(brand, year);
            this.hasCarrier = hasCarrier;
        }

        public boolean isHasCarrier() {
            return hasCarrier;
        }

        public void setHasCarrier(boolean hasCarrier) {
            this.hasCarrier = hasCarrier;
        }

        // Polymorphism - Overriding
        @Override
        public void startEngine() {
            System.out.println("Bike engine is starting with a vroom...");
        }

        // Abstraction
        public void displayDetails() {
            System.out.println("Bike Brand: " + getBrand());
            System.out.println("Year: " + getYear());
            System.out.println("Has Carrier: " + hasCarrier);
        }
    }

    public class OOPS {
        public static void main(String[] args) {
            Car myCar = new Car("Toyota", 2020, 4);
            Bike myBike = new Bike("Yamaha", 2018, true);

            // Encapsulation
            System.out.println("Car's Brand: " + myCar.getBrand());
            myCar.setBrand("Honda");
            System.out.println("Updated Car Brand: " + myCar.getBrand());

            // Inheritance and Polymorphism
            myCar.startEngine();
            myBike.startEngine();

            // Abstraction
            myCar.displayDetails();
            myBike.displayDetails();
        }
    }

