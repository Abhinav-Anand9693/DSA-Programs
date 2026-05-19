// class definition
class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

// main class to run the program
public class oops1 {
    public static void main(String[] args) {
        // object creation
        Student s1 = new Student();

        // assigning values
        s1.name = "Abhinav";
        s1.age = 23;

        // using object
        s1.study(); // Output: Abhinav is studying
    }
}

    

