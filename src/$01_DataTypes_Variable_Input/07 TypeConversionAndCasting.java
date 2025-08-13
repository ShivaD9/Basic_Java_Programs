package $01_DataTypes_Variable_Input;

class TypeConversionAndCasting {
    public static void main(String[] args) {

        // ----- Type Conversion (Widening) -----
        int numInt = 100; // int
        double numDouble = numInt; // int → double (automatic)
        System.out.println("Int value: " + numInt);
        System.out.println("After widening (int to double): " + numDouble);

        // ----- Type Casting (Narrowing) -----
        double price = 99.99;
        int priceInt = (int) price; // double → int (manual cast)
        System.out.println("Double value: " + price);
        System.out.println("After narrowing (double to int): " + priceInt);

        // ----- Example with char -----
        char letter = 'A';
        int asciiValue = letter; // char → int (automatic)
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);

        // ----- Example: int to char -----
        int code = 66;
        char ch = (char) code; // int → char (manual)
        System.out.println("Int to char: " + ch);
    }
}
