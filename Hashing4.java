
import java.util.*;

public class Hashing4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 2, 5, 3, 3};

        // HashMap to store element -> frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            // Increase count if key exists, otherwise start at 1
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequency map
        System.out.println("Element frequencies: " + freqMap);

        // Print each key-value pair
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
