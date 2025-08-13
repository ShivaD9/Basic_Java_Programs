package $02_Operators;

class ShorthandOperators {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Initial value of a: " + a);

        // ----- Shorthand Operators -----
        a += 5; // a = a + 5
        System.out.println("After a += 5  → " + a);

        a -= 3; // a = a - 3
        System.out.println("After a -= 3  → " + a);

        a *= 2; // a = a * 2
        System.out.println("After a *= 2  → " + a);

        a /= 4; // a = a / 4
        System.out.println("After a /= 4  → " + a);

        a %= 3; // a = a % 3
        System.out.println("After a %= 3  → " + a);

        // Example with String concatenation
        String message = "Hello";
        message += " World"; // message = message + " World"
        System.out.println("After message += ' World' → " + message);
    }
}

/*
📌 Shorthand (Compound) Assignment Operators in Java:
------------------------------------------------------
+=   Add and assign        →  a += b  → a = a + b
-=   Subtract and assign   →  a -= b  → a = a - b
*=   Multiply and assign   →  a *= b  → a = a * b
/=   Divide and assign     →  a /= b  → a = a / b
%=   Modulus and assign    →  a %= b  → a = a % b

✅ Advantages:
- Shorter and cleaner syntax
- Works with numbers and strings
*/
