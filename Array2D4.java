/*Matrix Type	Best Approach	                         Time Complexity
Fully sorted (like a 1D array)	                 ✅ Binary Search	O(log(m × n))
Only row & column sorted	                     ✅ Staircase Search	O(m + n)
No sorting	❌                                   Brute Force	O(m × n)*/
public class Array2D4 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        System.out.println(searchMatrix(matrix, target)); // true
    }
}

    

