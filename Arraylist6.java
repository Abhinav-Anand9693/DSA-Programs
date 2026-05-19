import java.util.ArrayList;
import java.util.Collections;

public class Arraylist6  {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);

        // Sorting the list
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}

    