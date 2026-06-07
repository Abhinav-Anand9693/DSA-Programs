public class bit10 {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {  // last bit check
                count++;
            }
            n = n >> 1;  // right shift
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 13;
        System.out.println("Set bits in " + number + " = " + countSetBits(number));
    }
    
}
