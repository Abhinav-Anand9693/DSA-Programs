public class recursion1 {
    static void printDecreasing(int n) {
        if (n == 0) return;  // base case
        System.out.println(n);  // print first
        printDecreasing(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        printDecreasing(n);
    }
}

