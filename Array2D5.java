public class Array2D5 {
    public static boolean StaircaseSearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // left
            } else {
                row++; // down
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
        int target = 11;
        System.out.println(StaircaseSearch(matrix, target)); // true
    }

    
}
