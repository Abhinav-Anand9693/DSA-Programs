public class string12 {
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();

        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int count = 1;

            // count consecutive characters
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // append character + count
            compressed.append(currentChar);
            if (count > 1) {
                compressed.append(count);
            }

            i++; // move to next new character
        }

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input1 = "aaabbbcc";
        String input2 = "abcd";
        String input3 = "aabbccdddde";

        System.out.println(compressString(input1)); // a3b3c2
        System.out.println(compressString(input2)); // abcd
        System.out.println(compressString(input3)); // a2b2c2d4e
    }
}

    

