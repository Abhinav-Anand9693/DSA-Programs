public class bit7 {
    public static void clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);      // 1s from left to j+1
        int b = (1 << i) - 1;         // 1s from 0 to i-1
        int bitMask = a | b;          // Combine both to get 0s in [i, j]
        int result = n & bitMask;

        System.out.println("After clearing bits from " + i + " to " + j + ": " + result);
    }

    public static void main(String[] args) {
        clearBitsInRange(10, 2, 5); // 255 = 11111111, clear bits from index 2 to 5 → 11000011 → 195
    }
}


