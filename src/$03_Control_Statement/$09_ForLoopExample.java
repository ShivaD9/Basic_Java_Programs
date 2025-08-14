package $03_Control_Statement;

class ForLoopExample {
    public static void main(String[] args) {

        System.out.println("Example 1: Basic For Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i: " + i);
        }

        System.out.println("\nExample 2: For Loop Using Comma");
        // Here we update two variables in one loop using a comma
        for (int i = 1, j = 5; i <= 5 && j >= 1; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}

