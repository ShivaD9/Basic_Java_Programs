package $02_Operators;

class OperatorPrecedenceExample {
    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;    // Multiplication has higher precedence than addition
        int result2 = (10 + 5) * 2;  // Parentheses change the order
        int result3 = 100 / 5 * 2;   // Division and multiplication have same precedence → left to right
        int result4 = 10 + 20 / 5 - 3; // Division first, then addition and subtraction left to right
        int result5 = 2 + 3 * 4 - 8 / 2; // *, / first, then +, -

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("100 / 5 * 2 = " + result3);
        System.out.println("10 + 20 / 5 - 3 = " + result4);
        System.out.println("2 + 3 * 4 - 8 / 2 = " + result5);

        // Example with relational and logical operators
        boolean check = 5 > 3 && 8 > 6 || 2 < 1;
        // > has higher precedence than &&, and && has higher precedence than ||
        System.out.println("5 > 3 && 8 > 6 || 2 < 1 → " + check);

        // Example with assignment and precedence
        int a = 5;
        int b = 10;
        int c = a + b * 2; // Multiplication first, then addition
        System.out.println("a + b * 2 = " + c);
    }
}

/*
📌 Java Operator Precedence (highest → lowest):
-----------------------------------------------
1. Parentheses: ( )
2. Unary: ++, --, +, -, !
3. Multiplication / Division / Modulus: *, /, %
4. Addition / Subtraction: +, -
5. Relational: <, <=, >, >=
6. Equality: ==, !=
7. Logical AND: &&
8. Logical OR: ||
9. Assignment: =, +=, -=, *=, /=, %=
🔹 When operators have the same precedence → evaluated from left to right (except assignment which is right to left).
*/
