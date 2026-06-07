import java.util.*;

public class DSA23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of courses:");
        int b = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] courses = new String[b];

        System.out.println("Enter course names:");
        for (int i = 0; i < b; i++) {
            courses[i] = sc.nextLine();
        }

        System.out.println("Enter course to search:");
        String c = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < b; i++) {
            if (c.equals(courses[i])) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }

        sc.close();
    }
}

