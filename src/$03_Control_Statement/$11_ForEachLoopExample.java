package $03_Control_Statement;

class ForEachLoopExample {
    public static void main(String[] args) {

        // Example 1: Simple array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("For-each loop with 1D array:");
        for (int num : numbers) { // num takes each value from numbers
            System.out.println(num);
        }

        // Example 2: Multi-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nFor-each loop with 2D array:");
        for (int[] row : matrix) { // row is a 1D array
            for (int value : row) { // value takes each element of row
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

