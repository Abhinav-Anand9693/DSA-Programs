public class bit6 {
    public static void clearLastIBits(int n, int i) {
        int bitMask = ~((1 << i) - 1);
        int result = n & bitMask;
        System.out.println("After clearing last " + i + " bits: " + result);
    }

    public static void main(String[] args) {
        clearLastIBits(29, 3);  // Example: 29 = 11101, after clearing last 3 bits → 11100 → 24
    }
}

    

