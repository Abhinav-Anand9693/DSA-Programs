public class recursion9 {
    // Recursive function to search key in arr
    public static int search(int[] arr, int index, int key) {
        // Base case: if index exceeds array length
        if (index == arr.length) {
            return -1; // element not found
        }

        // If element is found
        if (arr[index] == key) {
            return index;
        }

        // Recursive call to search in the rest of the array
        return search(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6};
        int key = 7;

        int result = search(arr, 0, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
  
}
