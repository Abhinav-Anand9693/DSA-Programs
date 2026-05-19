/*import java.util.*;

public class DSA15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers you want: ");
        int n = sc.nextInt();

        ArrayList<Integer> fib = new ArrayList<>();

        // Initialize first two Fibonacci numbers
        if (n >= 1) fib.add(0);       // F(0)
        if (n >= 2) fib.add(1);       // F(1)

        // Generate rest of the series from F(2) to F(n-1)
        for (int i = 2; i < n; i++) {
            int next = fib.get(i - 1) + fib.get(i - 2);
            fib.add(next);
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci Series: " + fib);

        sc.close();
    }
}*/

    
import java.util.*;

public class DSA15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        if (n >= 1) a[0] = 0;
        if (n >= 2) a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

