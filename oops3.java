// Step 1: Create a class with private variables
class Student {
    // Private data members - Data hiding
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String newName) {
        if(newName.length() > 2) {
            name = newName;
        } else {
            System.out.println("Name must be more than 2 characters.");
        }
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'
    public void setAge(int newAge) {
        if(newAge > 0 && newAge <= 100) {
            age = newAge;
        } else {
            System.out.println("Invalid age! Must be between 1 and 100.");
        }
    }
}

// Step 2: Access class through public methods
public class oops3 {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Using setter methods to set values
        s1.setName("Abhinav");
        s1.setAge(21);

        // Using getter methods to access values
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        // Trying to set invalid data
        s1.setName("A"); // too short
        s1.setAge(200);  // invalid
    }
}

    
