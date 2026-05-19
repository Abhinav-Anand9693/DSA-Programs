public class DSA26 {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "et";
        int n = haystack.length();
        int m = needle.length();

        int result = -1; // default = not found

        for (int i = 0; i <= n - m; i++) { // loop through haystack
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) { // found full match
                result = i;
                break;
            }
        }

        System.out.println(result); // prints 0 in this case
    }
}
