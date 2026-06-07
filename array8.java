public class array8 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;            // current subarray sum
        int max = arr[0];       // overall maximum sum

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];          // element add karo
            if (sum > max) {
                max = sum;               // max update karo
            }
            if (sum < 0) {
                sum = 0;                 // agar sum negative ho gaya, to reset karo
            }
        }

        System.out.println("Maximum Subarray Sum is: " + max);
    }
}


