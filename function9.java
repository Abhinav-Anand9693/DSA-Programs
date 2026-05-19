public class function9 {
    public static boolean primecheck(int n) {
        boolean isPrime = true;
        

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
                
            }
        }

       return isPrime;
    }

    public static void main(String[] args) {
      System.out.print(primecheck(7))  ;
    }
}
