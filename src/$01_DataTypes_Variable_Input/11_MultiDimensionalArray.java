package $01_DataTypes_Variable_Input;


class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declaration + Initialization
        int[][] matrix = new int[2][3]; // 2 rows, 3 columns

        // Assigning values
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        // Printing array using nested loops
        System.out.println("Matrix Elements:");
        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) { // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        // Direct Initialization
        int[][] marks = {
                {85, 90, 78},
                {88, 76, 92}
        };

        System.out.println("\nMarks Table:");
        for (int[] row : marks) { // for-each loop
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

