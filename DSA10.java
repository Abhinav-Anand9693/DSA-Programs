public class DSA10 {

    // Function to validate if the current Sudoku board is valid
    public static boolean isValidSudoku(char[][] board) {

        // Traverse each cell in the 9x9 board
        for (int i = 0; i < 9; i++) { // i = row index
            for (int j = 0; j < 9; j++) { // j = column index

                char current = board[i][j];

                // Skip empty cells ('.')
                if (current == '.') {
                    continue;
                }

                // 🟡 1. Check for duplicate in the current row
                for (int col = 0; col < 9; col++) {
                    // Ignore current column itself
                    if (col != j && board[i][col] == current) {
                        return false; // Duplicate found in the row
                    }
                }

                // 🟡 2. Check for duplicate in the current column
                for (int row = 0; row < 9; row++) {
                    // Ignore current row itself
                    if (row != i && board[row][j] == current) {
                        return false; // Duplicate found in the column
                    }
                }

                // 🟡 3. Check for duplicate in the current 3x3 sub-box
                // Calculate the starting row and column of the 3x3 box
                int boxRowStart = (i / 3) * 3;
                int boxColStart = (j / 3) * 3;

                // Traverse the 3x3 box
                for (int row = boxRowStart; row < boxRowStart + 3; row++) {
                    for (int col = boxColStart; col < boxColStart + 3; col++) {
                        // Skip checking the current cell itself
                        if ((row != i || col != j) && board[row][col] == current) {
                            return false; // Duplicate found in the 3x3 box
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        // Sample partially filled Sudoku board
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        // Call function and print result
        System.out.println("Is Sudoku valid? " + isValidSudoku(board));
    }
}

