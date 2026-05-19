
    import java.util.Stack;

public class stack9 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else {
                if (stack.isEmpty()) {
                    return false; // Closing without opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched type
                }
            }
        }

        // If stack empty → all matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "({[]})";   // valid
        String s2 = "([)]";     // invalid

        System.out.println(s1 + " → " + isValid(s1));
        System.out.println(s2 + " → " + isValid(s2));
    }
}

    

