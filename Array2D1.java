    import java.util.Scanner;
    public class Array2D1{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔸 Rows and Columns input lo
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // 🔸 2D Array declaration
        int[][] arr = new int[rows][cols];

        // 🔹 Input values from user
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 🔹 Print the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}

    

