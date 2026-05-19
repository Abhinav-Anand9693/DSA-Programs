//DeepCopyExample
class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;

        // Deep copy of marks array
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks[0] + ", " + marks[1]);
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        int[] arr = {90, 80};

        Student s1 = new Student("Abhinav", arr);

        // Deep copy - separate array created
        Student s2 = new Student(s1.name, s1.marks);

        // Changing s2’s marks won’t affect s1
        s2.marks[0] = 100;

        s1.display(); // Output: 90, 80
        s2.display(); // Output: 100, 80
    }
}
