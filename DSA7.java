public class DSA7 {
    // Method to check if we can reach the last index
    public boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }

    // Main method to run the program
    public static void main(String[] args) {
        DSA7 obj = new DSA7();
        // Test input
        int[] nums = {2, 3, 1, 1, 4};

        // Output result
        boolean result = obj.canJump(nums);
        System.out.println("Can jump to the last index: " + result);
    }
}

    

