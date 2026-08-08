class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started");
    }
}