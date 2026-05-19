import java.util.Stack;

public class stack6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: " + stack);

        Stack<Integer> tempStack = new Stack<>();

        // Pop from original and push to tempStack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // tempStack now has reversed order
        stack = tempStack;

        System.out.println("Reversed stack: " + stack);
    }
}


