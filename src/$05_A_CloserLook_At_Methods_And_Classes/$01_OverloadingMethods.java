package $05_A_CloserLook_At_Methods_And_Classes;

class OverloadDemo {
    // Overloaded methods with different parameter lists
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("One parameter: " + a);
    }

    void test(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    double test(double a) {
        System.out.println("One double parameter: " + a);
        return a * a;
    }
}

public class $01_OverloadingMethods {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.test();            // No parameters
        obj.test(10);          // One int parameter
        obj.test(10, 20);      // Two int parameters
        double result = obj.test(5.5); // One double parameter

        System.out.println("Result of double test: " + result);
    }
}
