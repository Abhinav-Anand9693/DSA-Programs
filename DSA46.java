public class DSA46 {

    public static int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {

            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } 
            else if (log.equals("./")) {
                // stay in same folder
                continue;
            } 
            else {
                // move into a folder like "d1/"
                depth++;
            }
        }

        return depth;
    }

    public static void main(String[] args) {

        // Example 1
        String[] logs1 = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs1)); // Output: 2

        // Example 2
        String[] logs2 = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs2)); // Output: 3

        // Example 3
        String[] logs3 = {"d1/","../","../","../"};
        System.out.println(minOperations(logs3)); // Output: 0
    }
}
