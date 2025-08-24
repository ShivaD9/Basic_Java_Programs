package $05_A_CloserLook_At_Methods_And_Classes;

class Outer {
    int outerVar = 100;

    // Static Nested Class
    static class Nested {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }
}

public class $13_NestedClassStaticDemo {
    public static void main(String[] args) {
        // Creating object of static nested class
        Outer.Nested nestedObj = new Outer.Nested();
        nestedObj.display();
    }
}
