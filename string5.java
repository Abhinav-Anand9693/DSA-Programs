//LargestStringAlphabetically
public class string5 {
   public static String findLargestString(String[] arr) {
        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "zebra", "banana", "mango", "orange"};
        System.out.println("Alphabetically Largest String: " + findLargestString(arr));
    }
}
   
    

