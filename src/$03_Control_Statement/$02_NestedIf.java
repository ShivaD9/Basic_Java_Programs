package $03_Control_Statement;

class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasVoterID = true;

        // Nested if to check voting eligibility
        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must have a voter ID to vote.");
            }
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        // Another example: checking grades
        int marks = 85;
        if (marks >= 80) {
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else {
                System.out.println("Grade: A");
            }
        }
    }
}

