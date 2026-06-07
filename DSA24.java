public class DSA24 {
    public static void main(String[] args) {
        int a = 12345;

        StringBuilder ab = new StringBuilder();

        // Keep extracting last digits until number becomes 0
        while (a > 0) {
            int c = a % 10;     // last digit
            ab.append(c);       // add digit to StringBuilder
            a = a / 10;         // remove last digit
        }

        System.out.println(ab.toString()); // print reversed number
    }
}

