package $05_A_CloserLook_At_Methods_And_Classes;

class NewStyleVarargs {
    // Varargs method
    static void show(int... nums) {
        System.out.print("Number of arguments: " + nums.length + " | Values: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show(10, 20, 30);
        show(1, 2);
        show(); // no arguments
    }
}
