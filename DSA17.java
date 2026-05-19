public class DSA17 {
    public static void moveZeroes(int[] arr) {
        int count = 0; // count variable track karega next non-zero element ka index

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];  // non-zero value ko current 'count' position pe daalo aur count increment karo
            }
        }

        // Second loop: remaining jagah par 0 fill kar do
        while (count < arr.length) {
            arr[count++] = 0;  // bache hue elements ko 0 se bhar do
        }
    }

    // Main function — program yahan se start hota hai
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
         moveZeroes(arr);

        // Final array ko print kar rahe hain
        for (int num : arr) {
            System.out.print(num + " ");  
        }
    }
}


