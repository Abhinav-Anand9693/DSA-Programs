public class sortinginsertion {
    // Function to perform Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // element to insert
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        insertionSort(arr);

        System.out.println("Sorted array (Insertion Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

