 import java.util.ArrayList;

public class Arraylist14 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;

        // Find breaking point
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get((i + 1) % n)) {
                bp = i;
                break;
            }
        }

        int left = (bp + 1) % n; // smallest
        int right = bp;          // largest

        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); list.add(15); list.add(6);
        list.add(8); list.add(9); list.add(10);

        int target = 16;

        System.out.println("Pair Sum 2 Exists: " + pairSum2(list, target));
    }

}
