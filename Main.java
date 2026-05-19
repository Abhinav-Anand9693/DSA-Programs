public class Main {
    
    public static boolean pali(String a) {
        int start = 0;
        int end = a.length() - 1;

        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // all pairs matched
    }

    public static void main(String[] args) {
        String a = "madam";
        System.out.println(pali(a)); // Output: true
    }
}

    