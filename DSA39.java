import java.util.*;

public class DSA39 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        // Split by "/"
        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Ignore empty and current directory
                continue;
            } else if (part.equals("..")) {
                // Go back one directory if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name
                stack.push(part);
            }
        }
        
        // Build the result
        StringBuilder result = new StringBuilder();
        
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        
        // If empty, return root "/"
        return result.length() == 0 ? "/" : result.toString();
    }
}