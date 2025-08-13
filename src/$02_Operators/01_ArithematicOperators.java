package $02_Operators;

class ArithematicOperators {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        // ----- Arithmetic Operations -----
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b)       : " + (a + b));
        System.out.println("Subtraction (a - b)    : " + (a - b));
        System.out.println("Multiplication (a * b) : " + (a * b));
        System.out.println("Division (a / b)       : " + (a / b));   // Integer division
        System.out.println("Modulus (a % b)        : " + (a % b));   // Remainder

        // ----- Floating point division -----
        double x = 15;
        double y = 4;
        System.out.println("Division (x / y) with double: " + (x / y)); // Gives decimal

        // ----- Using variables in expressions -----
        int result = (a + b) * (a - b);
        System.out.println("Expression result: (a + b) * (a - b) = " + result);
    }
}

/*
📌 Arithmetic Operators in Java:
---------------------------------
+   Addition
-   Subtraction
*   Multiplication
/   Division
%   Modulus (remainder)
*/
