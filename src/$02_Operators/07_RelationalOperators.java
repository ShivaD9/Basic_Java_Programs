package $02_Operators;

class RelationalOperators {
    public static void main(String[] args) {

        int a = 10, b = 20;

        System.out.println("a = " + a + ", b = " + b);

        // ----- Relational Operators -----
        System.out.println("a == b : " + (a == b)); // Equal to
        System.out.println("a != b : " + (a != b)); // Not equal to
        System.out.println("a > b  : " + (a > b));  // Greater than
        System.out.println("a < b  : " + (a < b));  // Less than
        System.out.println("a >= b : " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b : " + (a <= b)); // Less than or equal to

        // Example in if condition
        if (a < b) {
            System.out.println("a is smaller than b");
        }
    }
}

/*
📌 Relational Operators in Java:
--------------------------------
==   Equal to
!=   Not equal to
>    Greater than
<    Less than
>=   Greater than or equal to
<=   Less than or equal to

✅ Returns boolean values (true/false)
✅ Used in comparisons for if, loops, etc.
*/
