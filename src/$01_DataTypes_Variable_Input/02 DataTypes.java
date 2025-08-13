package $01_DataTypes_Variable_Input;

class DataTypes {
    public static void main(String[] args) {

        // ----- Integer Types -----
        byte byteVar = 100;       // 1 byte  (-128 to 127)
        short shortVar = 32000;   // 2 bytes (-32,768 to 32,767)
        int intVar = 100000;      // 4 bytes (-2^31 to 2^31-1)
        long longVar = 10000000000L; // 8 bytes (-2^63 to 2^63-1)

        // ----- Floating Point Types -----
        float floatVar = 3.14f;   // 4 bytes (~6-7 decimal digits)
        double doubleVar = 99.999; // 8 bytes (~15 decimal digits)

        // ----- Character Type -----
        char charVar = 'A';       // 2 bytes (stores Unicode characters)

        // ----- Boolean Type -----
        boolean boolVar = true;   // 1 bit (true/false)

        // ----- Printing Data Types -----
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + boolVar);
    }
}
