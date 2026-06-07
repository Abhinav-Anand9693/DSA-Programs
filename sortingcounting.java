public class sortingcounting {
    // Function to perform Counting Sort
    static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Find the maximum value in the array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count each element
        for (int num : arr) {
            count[num]++;
        }

        // Rebuild the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        
        countingSort(arr);

        System.out.println("Sorted array (Counting Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

