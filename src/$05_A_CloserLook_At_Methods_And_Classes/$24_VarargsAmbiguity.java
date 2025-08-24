package $05_A_CloserLook_At_Methods_And_Classes;

class VarargsAmbiguity {
    static void test(int... a) {
        System.out.println("int varargs");
    }

    static void test(boolean... b) {
        System.out.println("boolean varargs");
    }

    public static void main(String[] args) {
        test(1, 2, 3);         // calls int version
        test(true, false);     // calls boolean version

        // ❌ Ambiguity
        // test();  // ERROR: both methods could match
    }
}
