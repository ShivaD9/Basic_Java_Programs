package $01_DataTypes_Variable_Input;

import java.util.Scanner; // Required for taking input

class UserInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // ----- Taking different types of inputs -----
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Reads full line (including spaces)

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Reads integer

        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble(); // Reads decimal number

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean(); // Reads boolean

        // Output the entered values
        System.out.println("\n----- User Details -----");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Height   : " + height + " meters");
        System.out.println("Student? : " + isStudent);

        // Close scanner
        sc.close();
    }
}
