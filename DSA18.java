//MaxAreaHistogramBruteForce
public class DSA18 {
    public static int getMaxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];

            // Expand to the left
            int left = i;
            while (left > 0 && heights[left - 1] >= height) {
                left--;
            }

            // Expand to the right
            int right = i;
            while (right < n - 1 && heights[right + 1] >= height) {
                right++;
            }

            // Width = right - left + 1
            int width = right - left + 1;
            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        System.out.println("Max Area: " + getMaxArea(histogram));
    }
}

    

