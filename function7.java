public class function7 {

    // Method to compute factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to compute binomial coefficient C(n, k)
    public static int binomial(int n, int k) {
        if (k < 0 || k > n) return 0;  // Invalid case
        int num = factorial(n);
        int denom = factorial(k) * factorial(n - k);
        return num / denom;
    }

    public static void main(String[] args) {
        System.out.print(binomial(5, 3));  // Output: 10
    }
}

