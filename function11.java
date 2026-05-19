public class function11 {
    
    // Method to check if a number is prime
    public static boolean isprime(int n) {
        if (n <= 1) return false;  // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to print all prime numbers up to n
    public static void prime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for clean output
    }

    public static void main(String[] args) {
        prime(3000);
    }
}

