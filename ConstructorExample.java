
    // Define the class
public class ConstructorExample {

    // Instance variables
    String name;
    int age;

    // 1. Default Constructor (no arguments)
    ConstructorExample() {
        System.out.println("Default constructor called!");
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized Constructor
    ConstructorExample(String n, int a) {
        System.out.println("Parameterized constructor called!");
        name = n;
        age = a;
    }

    // 3. Copy Constructor (custom made)
    ConstructorExample(ConstructorExample obj) {
        System.out.println("Copy constructor called!");
        name = obj.name;
        age = obj.age;
    }

    // Method to print details
    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to run the code
    public static void main(String[] args) {

        // Using Default Constructor
        ConstructorExample student1 = new ConstructorExample();
        student1.showDetails(); // Output: Unknown, 0

        // Using Parameterized Constructor
        ConstructorExample student2 = new ConstructorExample("Abhinav", 21);
        student2.showDetails(); // Output: Abhinav, 21

        // Using Copy Constructor
        ConstructorExample student3 = new ConstructorExample(student2);
        student3.showDetails(); // Output: Abhinav, 21
    }
}


    

