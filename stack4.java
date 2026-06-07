
    import java.util.Stack;

    public class stack4{
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop(); // upar se hatao
        pushAtBottom(stack, data); // niche jao
        stack.push(top); // wapas build karo
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 9);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Output: 0 1 2 3
        }
    }
}

    

