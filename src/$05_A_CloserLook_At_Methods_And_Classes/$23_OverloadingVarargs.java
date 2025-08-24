package $05_A_CloserLook_At_Methods_And_Classes;

class OverloadingVarargs {
    static void display(String... values) {
        System.out.print("String Varargs: ");
        for (String s : values) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static void display(int... values) {
        System.out.print("Integer Varargs: ");
        for (int n : values) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display("Hello", "World");
        display(1, 2, 3, 4, 5);
    }
}
