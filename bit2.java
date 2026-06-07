public class bit2 {
    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            System.out.println("i-th bit is 0");
        } else {
            System.out.println("i-th bit is 1");
        }
    }

    public static void main(String[] args) {
        getIthBit(13, 2);  // Example: 13 in binary = 1101, 2nd bit (from right, 0-based) = 1
    }
}

    
