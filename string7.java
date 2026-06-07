public class string7 {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Step 1: First letter ko uppercase karke add karo
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Step 2: Rest string process karo
        for (int i = 1; i < str.length(); i++) {
            // Agar space mila to next character ko uppercase karo
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // space add karo
                i++; // next character
                sb.append(Character.toUpperCase(str.charAt(i))); // uppercase me add karo
            } else {
                sb.append(str.charAt(i)); // normal character
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "my name is abhinav";
        String result = toUpperCase(str);
        System.out.println("Formatted String: " + result);
    }
}
