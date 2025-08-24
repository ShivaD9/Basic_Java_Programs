package $05_A_CloserLook_At_Methods_And_Classes;

public class $19_StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";

        // --- equals() ---
        System.out.println("Comparing Strings:");
        System.out.println("s1 equals s2? " + s1.equals(s2)); // true
        System.out.println("s1 equals s3? " + s1.equals(s3)); // false
        System.out.println();

        // --- length() ---
        String str = "Java Programming";
        System.out.println("String: " + str);
        System.out.println("Length of string: " + str.length());
        System.out.println();

        // --- charAt() ---
        String name = "Vaishnavi";
        System.out.println("String: " + name);
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Character at index 4: " + name.charAt(4));
        System.out.println("Character at index 7: " + name.charAt(7));
    }
}
