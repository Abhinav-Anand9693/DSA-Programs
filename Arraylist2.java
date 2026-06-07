import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Getting element at index 1
        System.out.println("Element at index 1: " + fruits.get(1));

        // Updating index 1
        fruits.set(1, "Orange");

        // Removing element at index 0
        fruits.remove(0);

        // Checking size
        System.out.println("Size: " + fruits.size());

        // Printing the updated list
        System.out.println("Fruits: " + fruits);
    }
}

    

