//ShallowCopyExample
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks[0] + ", " + marks[1]);
    }
}

public class oops5 {
    public static void main(String[] args) {
        int[] arr = {90, 80};

        Student s1 = new Student("Abhinav", arr);

        // Shallow copy: s2 points to the same marks array
        Student s2 = new Student(s1.name, s1.marks);

        // Change in s2's marks will also affect s1
        s2.marks[0] = 100;

        s1.display(); // Output: 100, 80
        s2.display(); // Output: 100, 80
    }
}
