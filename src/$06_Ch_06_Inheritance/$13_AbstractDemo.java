package Ch_06_Inheritance;

// Abstract superclass
abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract void draw();

    // Concrete method
    void info() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class $13_AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();  // ❌ Error: Cannot instantiate abstract class

        Shape s; // Reference variable of abstract class

        s = new Circle();   // Circle object
        s.draw();           // Circle's implementation
        s.info();

        s = new Rectangle(); // Rectangle object
        s.draw();            // Rectangle's implementation
        s.info();
    }
}
