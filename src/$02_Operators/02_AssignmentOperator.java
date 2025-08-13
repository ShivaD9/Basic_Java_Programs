package $02_Operators;

class AssignmentOperator {
    public static void main(String[] args) {

        int a = 10; // Simple assignment
        System.out.println("Initial value of a: " + a);

        // ----- Compound Assignment Operators -----
        a += 5; // a = a + 5
        System.out.println("After a += 5  : " + a);

        a -= 3; // a = a - 3
        System.out.println("After a -= 3  : " + a);

        a *= 2; // a = a * 2
        System.out.println("After a *= 2  : " + a);

        a /= 4; // a = a / 4
        System.out.println("After a /= 4  : " + a);

        a %= 3; // a = a % 3
        System.out.println("After a %= 3  : " + a);

        // Example with another type
        double price = 100.0;
        price += 19.99; // price = price + 19.99
        System.out.println("Updated price : " + price);
    }
}

/*
📌 Assignment Operators in Java:
---------------------------------
=   Simple assignment
+=  Add and assign
-=  Subtract and assign
*=  Multiply and assign
/=  Divide and assign
%=  Modulus and assign
*/
