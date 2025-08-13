package $01_DataTypes_Variable_Input;

class LiteralExample {
    public static void main(String[] args) {

        // ----- Integer Literals -----
        int decimalLiteral = 100;       // Decimal (base 10)
        int binaryLiteral = 0b1100100;  // Binary (prefix 0b or 0B) → 100 in decimal
        int octalLiteral = 0144;        // Octal (prefix 0) → 100 in decimal
        int hexLiteral = 0x64;          // Hexadecimal (prefix 0x or 0X) → 100 in decimal

        // ----- Floating-Point Literals -----
        float floatLiteral = 3.14f;     // Need 'f' or 'F' for float
        double doubleLiteral = 3.14;    // Default is double
        double scientificLiteral = 1.23e2; // 1.23 × 10² = 123.0

        // ----- Character Literals -----
        char charLiteral = 'A';         // Single quotes
        char unicodeLiteral = '\u0041'; // Unicode for 'A'

        // ----- String Literal -----
        String stringLiteral = "Hello Java";

        // ----- Boolean Literals -----
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        // ----- Null Literal -----
        String nullLiteral = null;      // Can be assigned to reference types

        // Printing all literals
        System.out.println("Decimal literal: " + decimalLiteral);
        System.out.println("Binary literal: " + binaryLiteral);
        System.out.println("Octal literal: " + octalLiteral);
        System.out.println("Hex literal: " + hexLiteral);
        System.out.println("Float literal: " + floatLiteral);
        System.out.println("Double literal: " + doubleLiteral);
        System.out.println("Scientific literal: " + scientificLiteral);
        System.out.println("Char literal: " + charLiteral);
        System.out.println("Unicode literal: " + unicodeLiteral);
        System.out.println("String literal: " + stringLiteral);
        System.out.println("Boolean true literal: " + trueLiteral);
        System.out.println("Boolean false literal: " + falseLiteral);
        System.out.println("Null literal: " + nullLiteral);
    }
}

