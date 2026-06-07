 import java.util.Arrays;

public class DSA19 {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0; // No gap possible
        }
        
        // Sort the array
        Arrays.sort(nums);
        
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int gap = nums[i + 1] - nums[i];
            if (gap > max) {
                max = gap;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        DSA19 sol = new DSA19();
        int[] nums = {3, 6, 99, 1};
        int result = sol.maximumGap(nums);
        System.out.println("Maximum gap: " + result);
    }
}

    
