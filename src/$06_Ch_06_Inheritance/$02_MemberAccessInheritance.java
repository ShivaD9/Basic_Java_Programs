package Ch_06_Inheritance;

// Superclass
class A {
    public int pub = 1;         // public → accessible everywhere
    protected int pro = 2;      // protected → accessible in same package + subclass
    int def = 3;                // default → same package only
    private int pri = 4;        // private → not accessible directly

    void show() {
        System.out.println("Inside A:");
        System.out.println("public = " + pub);
        System.out.println("protected = " + pro);
        System.out.println("default = " + def);
        System.out.println("private = " + pri);
    }

    int getPrivateValue() {   // getter for private field
        return pri;
    }
}

// Subclass
class B extends A {
    void display() {
        System.out.println("\nInside B (subclass):");

        // Direct access
        System.out.println("public = " + pub);   // OK
        System.out.println("protected = " + pro); // OK
        System.out.println("default = " + def);  // OK (same package)
        // System.out.println("private = " + pri); // ❌ ERROR

        // Access private via method
        System.out.println("private (via getter) = " + getPrivateValue());
    }
}

// Main class
public class $02_MemberAccessInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // Superclass method
        superOb.show();

        // Subclass method
        subOb.display();
    }
}
