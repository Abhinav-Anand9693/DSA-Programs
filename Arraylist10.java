import java.util.ArrayList;

public class Arraylist10{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        System.out.println("Before swap: " + nums);

        // Swapping
        int temp = nums.get(0);
        nums.set(0, nums.get(1));
        nums.set(1, temp);

        System.out.println("After swap: " + nums);
    }
}

    

