package $05_A_CloserLook_At_Methods_And_Classes;

class StaticExample {
    // Static variable (shared among all objects)
    static int count = 0;

    // Instance variable (separate for each object)
    int id;

    // Constructor
    StaticExample() {
        count++;   // increments shared variable
        id = count;
    }

    // Static method (can access only static members)
    static void showCount() {
        System.out.println("Total objects created: " + count);
        // System.out.println(id); ❌ Error: cannot access non-static from static
    }

    // Non-static method (can access both static + instance)
    void showDetails() {
        System.out.println("Object ID: " + id + ", Count: " + count);
    }
}

public class $10_StaticDemo {
    public static void main(String[] args) {
        StaticExample.showCount(); // Call static method without object

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        obj1.showDetails();
        obj2.showDetails();
        obj3.showDetails();

        StaticExample.showCount(); // Show final count
    }
}
