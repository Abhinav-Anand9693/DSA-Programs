//MergeUsingTwoPointer
import java.util.*;

public class DSA13 {

    // Method to merge two sorted arrays using two pointers
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;  // arr1 ka size
        int n2 = arr2.length;  // arr2 ka size

        int[] merged = new int[n1 + n2]; // Final merged array banaya

        int i = 0, j = 0, k = 0; // i for arr1, j for arr2, k for merged array

        // Jab tak dono arrays me elements bache ho, compare karte raho
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++]; // arr1 ka chhota element daalo
            } else {
                merged[k++] = arr2[j++]; // arr2 ka chhota element daalo
            }
        }

        // Agar arr1 me koi element bacha ho to use copy karo
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Agar arr2 me koi element bacha ho to use copy karo
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged; // Final merged sorted array return
    }

    public static void main(String[] args) {
        // Dono sorted input arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merge arrays using two pointer method
        int[] result = mergeArrays(arr1, arr2);

        // Final output print karo
        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}
