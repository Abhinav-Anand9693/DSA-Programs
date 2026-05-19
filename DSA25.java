import java.util.Scanner;

public class DSA25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(0 + " " + 1);
            return;
        }

        StringBuilder b = new StringBuilder();
        int[] fib = new int[n + 1];  // array to store Fibonacci numbers

        fib[0] = 0;
        fib[1] = 1;
        b.append(fib[0]).append(" ").append(fib[1]);

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            b.append(" ").append(fib[i]);
        }

        System.out.println(b.toString());
    }
}
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println("0 1");
            return;
        }

        int a = 0, b = 1;
        System.out.print(a + " " + b);  // print first two numbers

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);  // print next Fibonacci number
            a = b;
            b = c;
        }
    }
}
*/

