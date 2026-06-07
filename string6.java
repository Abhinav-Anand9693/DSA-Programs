//StringBuilderExample
public class string6 {
     public static void main(String[] args) {

        // Step 1: Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Step 2: Append text
        sb.append(" World");

        // Step 3: Insert text
        sb.insert(5, ",");

        // Step 4: Replace text
        sb.replace(6, 11, " Java");

        // Step 5: Delete text
        sb.delete(5, 10);

        // Step 6: Reverse string
        sb.reverse();

        // Step 7: Print final string
        System.out.println("Final Output: " + sb.toString());
    }
}

    
 
