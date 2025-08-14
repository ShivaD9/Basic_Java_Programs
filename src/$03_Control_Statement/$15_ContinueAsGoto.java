package $03_Control_Statement;

class ContinueAsGoto {
    public static void main(String[] args) {
        outer: // label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Skipping when j = " + j + " in outer loop i = " + i);
                    continue outer; // jump to next iteration of outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Program finished.");
    }
}

