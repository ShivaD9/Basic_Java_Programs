package $03_Control_Statement;

class IfElseExample {
    public static void main(String[] args) {
        int age = 16;

        // If-Else to check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        // Another example: even or odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
}
