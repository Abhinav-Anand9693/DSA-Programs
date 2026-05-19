import java.util.Stack;
public class stack3 {
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // 3
        stack.pop();
        System.out.println(stack.peek()); // 2
        System.out.println(stack.isEmpty()); // false
    }
}

    
