public class DSA36 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 3, 0},
            {1, 4, 6},
            {2, 4, 5}
        };

        int row = a.length;
        int col = a[0].length;

        boolean[] zeroRows = new boolean[row];
        boolean[] zeroCols = new boolean[col];

        // Step 1: Find which rows and columns contain 0
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: Set elements to 0 based on recorded rows and columns
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    a[i][j] = 0;
                }
            }
        }

        // Step 3: Print the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

