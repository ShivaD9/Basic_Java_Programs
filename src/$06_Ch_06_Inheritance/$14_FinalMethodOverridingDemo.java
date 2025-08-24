package Ch_06_Inheritance;

// Superclass
class A {
    // final method cannot be overridden
    final void show() {
        System.out.println("This is a final method in class A");
    }

    void normalMethod() {
        System.out.println("This is a normal method in class A");
    }
}

// Subclass
class B extends A {
    // ❌ ERROR: Cannot override final method
    // void show() {
    // System.out.println("Trying to override final method");
    // }

    @Override
    void normalMethod() {
        System.out.println("Overridden normal method in class B");
    }
}

public class $14_FinalMethodOverridingDemo {
    public static void main(String[] args) {
        B obj = new B();

        obj.show(); // Calls final method from A
        obj.normalMethod(); // Calls overridden method from B
    }
}
