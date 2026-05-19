import java.util.ArrayList;

public class Arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(3);
        nums.add(17);
        nums.add(9);

        int max = nums.get(0);  // Assume first element is max

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }

        System.out.println("Maximum: " + max);
    }
}

    
