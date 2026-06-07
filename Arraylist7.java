 import java.util.ArrayList;
public class Arraylist7 {
    public static void main(String[] args) {
        // Creating an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // Adding students
        students.add("Abhinav");
        students.add("Ravi");
        students.add("Priya");

        // Display all students
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + students.get(i));
        }
    }
}

    

