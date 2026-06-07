//SortedCheck
public class recursion7 {
    static boolean isSorted(int[] arr, int index) {
        if(index == arr.length - 1) return true;
        if(arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9};
        System.out.println("Sorted? " + isSorted(arr, 0));
    }
}

    

