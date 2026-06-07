//FindElement
public class recursion8 {
    static boolean find(int[] arr, int index, int x) {
        if (index == arr.length) return false;    // base case: end reached
        if (arr[index] == x) return true;        // element found
        return find(arr, index + 1, x);          // recursive call
    }

        public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11};
        int x = 7;
        System.out.println("Is " + x + " in array? " + find(arr, 0, x));
    }
}

    

