public class bit8 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // Power of 2 can't be negative or 0

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(18)); // false
    }
    
}
