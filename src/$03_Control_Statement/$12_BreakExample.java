package $03_Control_Statement;

class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // exit the loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop ended.");
    }
}

