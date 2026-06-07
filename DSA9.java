public class DSA9 {

    // Function to return the index where target is found or should be inserted
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // Case 1: If target already exists at index i
            if (nums[i] == target) {
                return i;
            }

            // Case 2: If target should come before current element
            if (nums[i] > target) {
                return i;
            }
        }

        // Case 3: If target is greater than all elements, insert at the end
        return nums.length;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int result = searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
}

