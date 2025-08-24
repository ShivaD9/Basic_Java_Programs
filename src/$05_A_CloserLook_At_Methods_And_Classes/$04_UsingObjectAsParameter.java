// Example: Using Object as Parameter
package $05_A_CloserLook_At_Methods_And_Classes;

class Box {
    int width, height, depth;

    // Constructor
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    int volume() {
        return width * height * depth;
    }

    // Method that compares volumes of two boxes
    boolean isEqual(Box b) {  // <-- object passed as parameter
        return this.volume() == b.volume();
    }
}

public class $04_UsingObjectAsParameter {
    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4); // volume = 24
        Box b2 = new Box(4, 2, 3); // volume = 24
        Box b3 = new Box(3, 3, 3); // volume = 27

        System.out.println("b1 equals b2? " + b1.isEqual(b2)); // true
        System.out.println("b1 equals b3? " + b1.isEqual(b3)); // false
    }
}
