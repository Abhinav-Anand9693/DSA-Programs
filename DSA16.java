public class DSA16 {
    public static void main(String[] args) {
        int a[] = {3, 5, 7,7,7, 3, 3, 3, 2, 1};

        // Step 1: Sort using Selection Sort
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        // Step 2: Print Duplicates
        System.out.println("Duplicate elements are:");
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i + 1]) {
                System.out.print(a[i] + " ");
                // Skip duplicates
                while (i < a.length - 1 && a[i] == a[i + 1]) {
                    i++;
                }
            }
        }
    }
}

