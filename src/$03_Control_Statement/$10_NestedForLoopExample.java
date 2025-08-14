package $03_Control_Statement;

class NestedForLoopExample {
    public static void main(String[] args) {

        System.out.println("Example 1: Multiplication Table (Nested For Loop)");

        for (int i = 1; i <= 3; i++) { // Outer loop (rows)
            for (int j = 1; j <= 3; j++) { // Inner loop (columns)
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to next line
        }

        System.out.println("\nExample 2: Star Pattern");

        for (int i = 1; i <= 5; i++) { // Outer loop controls rows
            for (int j = 1; j <= i; j++) { // Inner loop controls stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

