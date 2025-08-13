package $01_DataTypes_Variable_Input;

class NamingConvention {
    public static void main(String[] args) {

        // ----- Variable Names (camelCase) -----
        int studentAge = 20;
        String firstName = "John";

        // ----- Constant Names (UPPER_CASE with underscores) -----
        final double PI_VALUE = 3.14159;

        // ----- Class Names (PascalCase) -----
        // Example: NamingConvention (this class itself)

        // ----- Method Names (camelCase) -----
        printStudentDetails(firstName, studentAge);

        // Printing constant
        System.out.println("Constant PI_VALUE: " + PI_VALUE);
    }

    // Example method using camelCase
    static void printStudentDetails(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

