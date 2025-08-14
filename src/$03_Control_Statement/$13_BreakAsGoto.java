package $03_Control_Statement;

class BreakAsGoto {
    public static void main(String[] args) {
        outer: // label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of both loops!");
                    break outer; // jumps to end of outer loop
                }
            }
        }
        System.out.println("Program finished.");
    }
}

