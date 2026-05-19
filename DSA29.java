import java.util.*;

public class DSA29 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add nums1 elements to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check nums2 against set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert HashSet<Integer> -> int[]
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        DSA29 obj = new DSA29();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));

        // Another test
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        int[] result2 = obj.intersection(nums3, nums4);

        System.out.println("Intersection: " + Arrays.toString(result2));
    }
}

