public class DSA5 {
    // Function to find the longest common prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];  // assume first string is the prefix
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);  // reduce last character
                if (prefix.isEmpty())
                    return "";  // no common prefix found
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
    }
}

    
