public class Array2D2 {
    public static void printSpiral(int[][] matrix) {
        if (matrix.length == 0) return;

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // ➤ Top row (left to right)
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }

            // ➤ Right column (top to bottom)
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endCol] + " ");
            }

            // ➤ Bottom row (right to left)
            if (startRow < endRow) {
                for (int col = endCol - 1; col >= startCol; col--) {
                    System.out.print(matrix[endRow][col] + " ");
                }
            }

            // ➤ Left column (bottom to top)
            if (startCol < endCol) {
                for (int row = endRow - 1; row > startRow; row--) {
                    System.out.print(matrix[row][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {3, 4, 5}
        };

        System.out.println("Spiral Order:");
        printSpiral(matrix);
    }
}

    

