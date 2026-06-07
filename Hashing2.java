 
    import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Iterate keys
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Iterate entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
/* 
| Feature           | HashMap   | HashSet       | LinkedHashMap  | LinkedHashSet  | TreeMap        |
| ----------------- | --------- | ------------- | -------------- | -------------- | -------------- |
| Stores            | Key-Value | Elements      | Key-Value      | Elements       | Key-Value      |
| Ordering          | None      | None          | Insertion      | Insertion      | Sorted (key)   |
| Null keys         | 1 allowed | N/A           | 1 allowed      | N/A            | ❌ Not allowed  |
| Null values       | Multiple  | One null elem | Multiple       | One null elem  | Multiple       |
| Performance (avg) | O(1)      | O(1)          | O(1)           | O(1)           | O(log n)       |
| Backed by         | Hashing   | Hashing       | Hashing + List | Hashing + List | Red-Black Tree |

    */

