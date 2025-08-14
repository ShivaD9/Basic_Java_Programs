package $03_Control_Statement;

class DoWhileExample {
    public static void main(String[] args) {

        int count = 1;

        System.out.println("Example 1: Basic do-while loop");
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5); // Loop runs while condition is true


        System.out.println("\nExample 2: Runs at least once even if condition is false");
        int num = 10;
        do {
            System.out.println("This will print even though num is greater than 5");
        } while (num < 5); // Condition is false initially, but body still runs once
    }
}

