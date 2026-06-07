import java.util.*;

public class Hashing6 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Store frequencies of nums1 in a map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // List to store intersection result
        List<Integer> resultList = new ArrayList<>();

        // Check nums2 elements against freqMap
        for (int num : nums2) {
            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
                resultList.add(num);
                freqMap.put(num, freqMap.get(num) - 1); // decrease frequency
            }
        }

        // Convert List<Integer> -> int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println("Intersection: " + Arrays.toString(intersect(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};

        System.out.println("Intersection: " + Arrays.toString(intersect(nums3, nums4)));
    }
}

