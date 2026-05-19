public class palidromecheck1 {
  
        public static void main(String[] args) {
            int a[] = {1, 2, 3, 2, 1}; // original array
            int n = a.length;
            int b[] = new int[n]; // reversed array
    
            // Store reversed elements into b[]
            for (int i = 0; i < n; i++) {
                b[i] = a[n - 1 - i];
            }
    
            // Compare original and reversed arrays
            boolean isPalindrome = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    isPalindrome = false;
                    break;
                }
            }
    
            // Output result
            if (isPalindrome) {
                System.out.println("This is a palindrome");
            } else {
                System.out.println("This is not a palindrome");
            }
        }
    }
    
    

