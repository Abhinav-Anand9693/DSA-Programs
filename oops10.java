// Abstract class
abstract class Vehicle {
    abstract void startEngine();  // Abstract method

    void fuelType() {
        System.out.println("This vehicle uses fuel.");
    }
}

// Concrete class
class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started with key.");
    }
}

// Another concrete class
class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started with kick.");
    }
}

// Main class to test
public class oops10 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();  // Output: Car engine started with key.
        car.fuelType();     // Output: This vehicle uses fuel.

        Vehicle bike = new Bike();
        bike.startEngine(); // Output: Bike engine started with kick.
        bike.fuelType();    // Output: This vehicle uses fuel.
    }
}


