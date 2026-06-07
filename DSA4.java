//TwoPointersExample
public class DSA4 {

    public static boolean hasPairWithSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8, 9};
        int target = 10;
        System.out.println(hasPairWithSum(nums, target)); // true
    }
}

    
