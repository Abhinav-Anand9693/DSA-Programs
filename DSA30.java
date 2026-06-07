import java.util.*;

public class DSA30 {
    public static String originalDigits(String s) {
        int[] count = new int[26]; // letter frequency
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int[] digits = new int[10];

        // unique identifiers
        digits[0] = count['z' - 'a']; // zero
        digits[2] = count['w' - 'a']; // two
        digits[4] = count['u' - 'a']; // four
        digits[6] = count['x' - 'a']; // six
        digits[8] = count['g' - 'a']; // eight

        // others deduced
        digits[1] = count['o' - 'a'] - digits[0] - digits[2] - digits[4]; // one
        digits[3] = count['h' - 'a'] - digits[8]; // three
        digits[5] = count['f' - 'a'] - digits[4]; // five
        digits[7] = count['s' - 'a'] - digits[6]; // seven
        digits[9] = count['i' - 'a'] - digits[5] - digits[6] - digits[8]; // nine

        // build result in ascending order
        StringBuilder sb = new StringBuilder();
        for (int d = 0; d <= 9; d++) {
            for (int i = 0; i < digits[d]; i++) {
                sb.append(d);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Example tests
        String s1 = "owoztneoer";
        String s2 = "fviefuro";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + originalDigits(s1)); // Expected "012"

        System.out.println("Input: " + s2);
        System.out.println("Output: " + originalDigits(s2)); // Expected "45"

        // You can test with your own input as well
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scrambled string of digits: ");
        String userInput = scanner.nextLine();
        System.out.println("Reconstructed digits: " + originalDigits(userInput));
        scanner.close();
    }
}

