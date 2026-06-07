import java.util.*;

public class Hashing3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");   // duplicate, ignored
        set.add(null);  // one null allowed

        System.out.println("HashSet: " + set);
    }
}
