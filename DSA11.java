//PascalsTriangle
import java.util.*;
public class DSA11 
     {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            
            // First element is always 1
            currentRow.add(1);

            // Fill the middle elements using values from the previous row
            for (int col = 1; col < row; col++) {
                int val = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                currentRow.add(val);
            }

            // Last element is always 1 (except for row 0)
            if (row > 0) {
                currentRow.add(1);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    // Testing the code
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

    

