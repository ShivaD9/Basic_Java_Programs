package $05_A_CloserLook_At_Methods_And_Classes;

class Demo {
    // Final variable (constant)
    final int CONSTANT_VALUE = 100;

    // Final method (cannot be overridden)
    final void showMessage() {
        System.out.println("This is a final method.");
    }
}

// Final class (cannot be extended)
// final class FinalClass { }

// Class that uses Demo
public class $11_FinalDemo {
    public static void main(String[] args) {
        Demo d = new Demo();

        // Final variable example
        System.out.println("Constant Value: " + d.CONSTANT_VALUE);

        // Trying to change final variable ❌ ERROR
        // d.CONSTANT_VALUE = 200;

        // Calling final method
        d.showMessage();
    }
}
