package $01_DataTypes_Variable_Input;

class Variables {
    public static void main(String[] args) {

        // ----- Primitive Data Types -----
        byte b = 10;                 // 1 byte
        short s = 300;               // 2 bytes
        int i = 10000;               // 4 bytes
        long l = 10000000000L;       // 8 bytes (need 'L' for long literal)

        float f = 3.14f;             // 4 bytes (need 'f' for float literal)
        double d = 99.99;            // 8 bytes

        char c = 'A';                // 2 bytes (stores a single character)
        boolean isJavaFun = true;    // 1 bit (true/false)

        // ----- Printing Variables -----
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + isJavaFun);

        // ----- Variable Re-assignment -----
        i = 5000; // changing value of i
        System.out.println("Updated int value: " + i);

        // ----- Using variables in expressions -----
        int sum = i + b;
        System.out.println("Sum of int and byte: " + sum);
    }
}
