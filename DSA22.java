import java.util.*;

public class DSA22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10; // add last digit
            temp /= 10;       // remove last digit
        }

        // Check divisibility by 3, 5, or 7
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
            System.out.println("This is a lucky number");
        } else {
            System.out.println("This is not a lucky number");
        }
    }
}
