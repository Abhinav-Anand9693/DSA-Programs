public class bit3 {
    public static void setIthBit(int n, int i) {
        int bitMask = 1 << i;
        int newNumber = n | bitMask;
        System.out.println("Number after setting i-th bit: " + newNumber);
    }
        public static void main(String[] args) {
        setIthBit(10, 4);  // Example: 10 = 1010, setting 1st bit
    }
}

    

