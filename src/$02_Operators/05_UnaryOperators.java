package $02_Operators;

class UnaryOperators {
    public static void main(String[] args) {

        int a = 5;
        boolean flag = true;

        System.out.println("Initial value of a: " + a);

        // ----- Unary Plus (+) and Minus (-) -----
        System.out.println("Unary plus (+a)  : " + (+a)); // No change
        System.out.println("Unary minus (-a) : " + (-a)); // Negates value

        // ----- Increment Operators -----
        System.out.println("Post-increment (a++) : " + (a++)); // Prints 5, then a=6
        System.out.println("After post-increment, a = " + a); // 6
        System.out.println("Pre-increment (++a)  : " + (++a)); // a=7, then prints 7

        // ----- Decrement Operators -----
        System.out.println("Post-decrement (a--) : " + (a--)); // Prints 7, then a=6
        System.out.println("After post-decrement, a = " + a); // 6
        System.out.println("Pre-decrement (--a)  : " + (--a)); // a=5, then prints 5

        // ----- Logical NOT (!) -----
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag)); // Negates boolean
    }
}

/*
📌 Unary Operators in Java:
---------------------------
+   Unary plus (no change)
-   Unary minus (negates)
++  Increment (pre/post)
--  Decrement (pre/post)
!   Logical NOT (boolean negation)

✅ Pre vs Post:
++a → Increment first, then use value
a++ → Use value first, then increment
*/
