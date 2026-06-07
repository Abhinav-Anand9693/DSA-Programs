import java.util.*;

public class DSA43{

    public static int calculate(String s) {

        int num = 0;
        int sign = 1; // +1 for positive, -1 for negative
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If character is digit
            if (Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');
            }

            // If '+' operator
            else if (ch == '+') {

                result += sign * num;

                num = 0;
                sign = 1;
            }

            // If '-' operator
            else if (ch == '-') {

                result += sign * num;

                num = 0;
                sign = -1;
            }

            // If opening bracket '('
            else if (ch == '(') {

                // Store current result
                stack.push(result);

                // Store current sign
                stack.push(sign);

                // Reset result and sign
                result = 0;
                sign = 1;
            }

            // If closing bracket ')'
            else if (ch == ')') {

                // Add current number
                result += sign * num;

                num = 0;

                // Multiply with sign before bracket
                result *= stack.pop();

                // Add previous result
                result += stack.pop();
            }
        }

        // Add last number
        result += sign * num;

        return result;
    }

    public static void main(String[] args) {

        String s1 = "1 + 1";
        String s2 = " 2-1 + 2 ";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(calculate(s1)); // 2
        System.out.println(calculate(s2)); // 3
        System.out.println(calculate(s3)); // 23
    }
}