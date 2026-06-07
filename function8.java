// OverloadingExample 

      public class function8 {
    

        // Method with one int parameter
        public static int multiply(int a) {
            return a * a;
        }
    
        // Method with two int parameters
        public static int multiply(int a, int b) {
            return a * b;
        }
    
        // Method with two double parameters
        public static double multiply(double a, double b) {
            return a * b;
        }
    
        public static void main(String[] args) {
            System.out.println("Square of 5: " + multiply(5));              // Calls first method
            System.out.println("Product of 4 and 6: " + multiply(4, 6));    // Calls second method
            System.out.println("Product of 2.5 and 3.2: " + multiply(2.5, 3.2)); // Calls third method
        }
    }
    
    //NOTE int sum(int a,int b)   this is  not function Overloading 
    //  float sum(int a,int b)
