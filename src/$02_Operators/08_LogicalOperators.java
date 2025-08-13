package $02_Operators;

class LogicalOperators {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x + ", y = " + y);

        // ----- Logical Operators -----
        System.out.println("x && y : " + (x && y)); // Logical AND
        System.out.println("x || y : " + (x || y)); // Logical OR
        System.out.println("!x     : " + (!x));     // Logical NOT
        System.out.println("!y     : " + (!y));     // Logical NOT

        // Example in if statement
        int age = 25;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("✅ You are allowed entry.");
        } else {
            System.out.println("❌ Entry denied.");
        }

        // Another example with OR
        boolean hasCoupon = false;
        boolean isMember = true;

        if (hasCoupon || isMember) {
            System.out.println("🎉 You get a discount!");
        }
    }
}

/*
📌 Logical Operators in Java:
------------------------------
&&   Logical AND (true if both are true)
||   Logical OR  (true if at least one is true)
!    Logical NOT (negates the value)

✅ Always returns boolean (true/false)
✅ Often used in conditions with relational operators
*/
