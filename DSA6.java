public class DSA6 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";

        // i = start index, j = end index of substring
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                StringBuilder sb = new StringBuilder(sub);
                String rev = sb.reverse().toString();

                if (sub.equals(rev) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        DSA6 sol = new DSA6();
        String s = "ababacbg";
        System.out.println("Longest Palindromic Substring: " + sol.longestPalindrome(s));
    }
}

    

