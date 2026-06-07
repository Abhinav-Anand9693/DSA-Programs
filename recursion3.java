//IncreasingOrder
public class recursion3 {

    // Recursive function to print numbers from 1 to n
    static void printIncreasing(int n) {
        if (n == 0) return;            // base case
        printIncreasing(n - 1);        // recursive call first
        System.out.println(n);         // then print
    }

    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);   // prints: 1 2 3 4 5
    }
}

