import java.util.*;

public class DSA44 {

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // agar digit nahi hai → push
            if (!Character.isDigit(ch)) {
                stack.push(ch);
            } 
            // agar digit hai → previous char hatao
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        // stack se string build karo
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abc3d2";
        String output = clearDigits(input);

        System.out.println("Output: " + output);
    }
}