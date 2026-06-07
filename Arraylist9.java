 import java.util.ArrayList;

public class Arraylist9 {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1); height.add(8); height.add(6); height.add(2);
        height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);

        int maxWater = 0;

        // Brute force: Try all possible pairs
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int area = ht * width;
                maxWater = Math.max(maxWater, area);
            }
        }

        System.out.println("Max Water (Brute Force): " + maxWater);
    }
}

    

