public class string9 {
    public static String reverse(String a) {
        StringBuilder ab = new StringBuilder(a); // StringBuilder initialized with 'a'
        ab.reverse();                            // Using reverse() of StringBuilder
        return ab.toString();                    // Convert back to string
    }

    public static void main(String[] args) {
        String a = "Abhinav";
        System.out.println(reverse(a)); // Output: vanihbA
    }
}

