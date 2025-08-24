package Ch_06_Inheritance;

// Superclass
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i: " + i + ", j: " + j);
    }
}

// Subclass
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);  // call superclass constructor
        k = c;
    }

    // Overridden show() method
    @Override
    void show() {
        super.show(); // call superclass's show()
        System.out.println("k: " + k);
    }
}

// Main class
public class $11_SuperWithOverriding {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        System.out.println("Calling show() on subclass object:");
        subOb.show(); // calls overridden method in B
    }
}

