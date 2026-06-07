
    import java.util.Stack;

     public class stack5 {
         public static void main(String[] args) {
        String str = "Hello World";
        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters and print
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

    

