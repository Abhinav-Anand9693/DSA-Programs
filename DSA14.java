import java.util.*;

public class DSA14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int original = a;
        int sum = 0;
        int digits = String.valueOf(a).length();

        while (a > 0) {
            int digit = a % 10;
            sum += Math.pow(digit, digits);
            a = a / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
 

