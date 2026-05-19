public class DSA12 {
    public static void main(String[] args) {
        // 👇 Yeh hai input array (stock prices per day)
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Step 1: Initialize min price and max profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Step 2: Loop through each price
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Best buying price so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Best selling profit so far
            }
        }

        // Step 3: Output the result
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
