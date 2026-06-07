public class DSA1 {
    public static int Rainwater(int height[]) {
        int n = height.length;

        // Step 1: build leftmax array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // Step 2: build rightmax array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        // Step 3: calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterlevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {9,2,4,2,5,6,4,9};
        System.out.println(Rainwater(height));
    }
}
