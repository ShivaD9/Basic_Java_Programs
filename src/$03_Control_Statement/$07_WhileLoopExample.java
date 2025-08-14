package $03_Control_Statement;

class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        // Print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Example: Sum of first 5 numbers
        int num = 1;
        int sum = 0;
        while (num <= 5) {
            sum += num;
            num++;
        }
        System.out.println("Sum of first 5 numbers: " + sum);
    }
}
