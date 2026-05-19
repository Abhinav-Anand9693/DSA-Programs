//Factorial
public class recursion4 {

    // Recursive function to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;    // base case
        return n * factorial(n - 1);       // recursion
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);   // 5! = 5×4×3×2×1 = 120
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

