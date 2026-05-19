 import java.util.ArrayList;
public class Arraylist13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(6);
        int target = 7;

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                System.out.println("Pair: " + list.get(left) + ", " + list.get(right));
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}


