package Ch_06_Inheritance;

// Superclass
class A {
    A() {
        System.out.println("Constructor of A (Superclass)");
    }
}

// Subclass
class B extends A {
    B() {
        System.out.println("Constructor of B (Subclass)");
    }
}

// Another Subclass
class C extends B {
    C() {
        System.out.println("Constructor of C (Subclass)");
    }
}

// Main class
public class $09_ConstructorOrder {
    public static void main(String[] args) {
        System.out.println("Creating object of C:");
        C c = new C();

        System.out.println("\nCreating object of B:");
        B b = new B();
    }
}
