public class bit4 {
    public static void clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        int newNumber = n & bitMask;
        System.out.println("Number after clearing i-th bit: " + newNumber);
    }

    public static void main(String[] args) {
        clearIthBit(10, 1);  // Example: 10 = 1010, clear 1st bit
    }
}

    

