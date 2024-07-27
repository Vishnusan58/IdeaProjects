public class Ver {

    public static void main(String[] args) {
        String[] matrix = {"abc", "def", "ghi"};
        int rows = matrix.length;
        printPattern(matrix, rows);
    }

    public static void printPattern(String[] matrix, int rows) {
        int cols = matrix[0].length();

        // Iterate through each row of the matrix
        for (int i = 0; i < rows; i++) {
            // Print leading asterisks
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print characters from the current row
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i].charAt(j));
            }

            // Print trailing asterisks (except for the last row)
            if (i < rows - 1) {
                for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
