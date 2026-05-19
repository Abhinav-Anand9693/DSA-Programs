public class function10 {
   

        // Function to check if a number is prime
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // 0 and 1 are not prime numbers
            }
    
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // Not a prime number
                }
            }
    
            return true; // Prime number
        }
    
        public static void main(String[] args) {
            int num = 29; // Example number
    
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    



    