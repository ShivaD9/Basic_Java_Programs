package $02_Operators;

class IfElseExample {
    public static void main(String[] args) {

        int marks = 75; // Example marks

        System.out.println("Student marks: " + marks);

        // ----- if-else if-else Example -----
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // ----- Simple if example -----
        if (marks >= 40) {
            System.out.println("Status: Pass");
        }

        // ----- if-else Example -----
        boolean isPass = marks >= 40;
        if (isPass) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}

/*
📌 if-else in Java:
-------------------
if (condition) {
    // runs if condition is true
} else if (condition2) {
    // runs if condition2 is true
} else {
    // runs if no above condition is true
}

✅ Notes:
- Conditions must be boolean expressions
- Curly braces are optional for single-line statements
*/
