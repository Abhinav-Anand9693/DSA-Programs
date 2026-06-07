public class bit5 {
    public static void updateIthBit(int n, int i, int newBit) {
        // Step 1: Clear the i-th bit
        int bitMask = ~(1 << i);
        n = n & bitMask;

        // Step 2: Set the i-th bit to newBit (0 or 1)
        int updatedNumber = n | (newBit << i);

        System.out.println("Number after updating i-th bit: " + updatedNumber);
    }

    public static void main(String[] args) {
        updateIthBit(10, 1, 0);  // 10 = 1010, update 1st bit to 0 → should become 8
        updateIthBit(10, 0, 1);  // 10 = 1010, update 0th bit to 1 → should become 11
    }
}

    
