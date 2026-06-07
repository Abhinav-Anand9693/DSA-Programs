public class string10 {
    public static int lowercase(String a) {
        int b = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                b++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        String a = "aeiouAEIOU";
        System.out.println(lowercase(a)); // Output: 4
    }
}

/*import java.util.Scanner;

public class string10 {
    public static int countVowels(String a) {
        int b = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = Character.toLowerCase(a.charAt(i)); // case-insensitive
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                b++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        System.out.print("Enter a string: ");
        String a = sc.nextLine(); // read full line input

        int vowelCount = countVowels(a);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
 */
