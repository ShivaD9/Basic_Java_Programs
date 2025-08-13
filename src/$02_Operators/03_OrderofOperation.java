package $02_Operators;

class OrderofOperation {
    public static void main(String[] args) {

        // Example values
        int a = 10, b = 5, c = 2;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // ----- Without parentheses -----
        int result1 = a + b * c; // Multiplication happens before addition
        System.out.println("a + b * c = " + result1); // 10 + (5*2) = 20

        // ----- With parentheses -----
        int result2 = (a + b) * c; // Parentheses evaluated first
        System.out.println("(a + b) * c = " + result2); // (10+5) * 2 = 30

        // ----- More complex example -----
        int result3 = a + b - c * a / b;
        // Step-by-step: c * a = 20, 20 / b = 4, a + b = 15, 15 - 4 = 11
        System.out.println("a + b - c * a / b = " + result3);

        // ----- Using double for decimal results -----
        double result4 = a + b / (double) c;
        System.out.println("a + b / (double) c = " + result4); // 10 + 2.5 = 12.5
    }
}

/*
📌 Java Operator Precedence (High → Low):
-----------------------------------------
1. Parentheses ()        → the highest priority
2. Unary (+, -, ++, --, !)
3. Multiplication/Division/Modulus (*, /, %)
4. Addition/Subtraction (+, -)
5. Relational (<, >, <=, >=)
6. Equality (==, !=)
7. Logical AND (&&)
8. Logical OR (||)
9. Assignment (=, +=, -=, etc.) → the lowest priority
*/
