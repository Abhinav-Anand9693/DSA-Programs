public class function12 {
    public static boolean containsDuplicate(int[] nums) {
        int[] temp = new int[nums.length];
        int tempIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

            // Check if current element exists in temp array
            for (int j = 0; j < tempIndex; j++) {
                if (nums[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                return true;
            }

            // Add element to temp array
            temp[tempIndex++] = nums[i];
        }

        return false;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 1};
        System.out.println(containsDuplicate(input)); // Output: true
    }
    
}
