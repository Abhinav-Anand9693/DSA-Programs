public class Array2D7 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},   // Second row
            {7, 8, 9}
        };

        int rowIndex = 1; // second row ka index
        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[rowIndex][j];
        }

        System.out.println("Sum of second row: " + sum);
    }
}

    /*public class MatrixLastRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}   // Last row
        };

        int lastRowIndex = matrix.length - 1; // last row ka index
        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[lastRowIndex][j];
        }

        System.out.println("Sum of last row: " + sum);
    }
}
 */
/*public class MatrixLastColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int lastColIndex = matrix[0].length - 1; // last column ka index
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][lastColIndex];
        }

        System.out.println("Sum of last column: " + sum);
    }
}
 */