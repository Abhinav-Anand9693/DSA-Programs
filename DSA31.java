import java.util.*;

public class DSA31 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 5, 4, 3, 3, 2};
        HashMap<Integer, Integer> ab = new HashMap<>();

        // Count frequencies
        for (int num : a) {
            ab.put(num, ab.getOrDefault(num, 0) + 1);
        }

        // Print elements with frequency > 1
        for (Map.Entry<Integer, Integer> entry : ab.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
 
