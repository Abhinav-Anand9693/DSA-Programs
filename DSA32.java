//FibonacciSeries
public class DSA32 {
    public static void main(String[] args) {
        int n = 10; // number of terms you want
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // calculate the next number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
