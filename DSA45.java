import java.util.*;

public class DSA45 {

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        // for-each loop
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                stack.pop(); // remove bad pair
            } else {
                stack.push(ch); // add character
            }
        }

        // build final string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "leEeetcode";
        String input2 = "abBAcC";
        String input3 = "s";

        System.out.println(makeGood(input1)); // leetcode
        System.out.println(makeGood(input2)); // ""
        System.out.println(makeGood(input3)); // s
    }
}
