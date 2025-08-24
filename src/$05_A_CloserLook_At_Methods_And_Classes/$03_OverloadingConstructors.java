package $05_A_CloserLook_At_Methods_And_Classes;

class Box1 {
    int width, height, depth;

    // Constructor 1: No parameters (default)
    Box1() {
        width = height = depth = 0;
        System.out.println("Created empty Box");
    }

    // Constructor 2: One parameter (cube)
    Box1(int side) {
        width = height = depth = side;
        System.out.println("Created cube with side = " + side);
    }

    // Constructor 3: Three parameters (box with dimensions)
    Box1(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Created box with dimensions " + w + " x " + h + " x " + d);
    }

    // Method to calculate volume
    int volume() {
        return width * height * depth;
    }
}

public class $03_OverloadingConstructors {
    public static void main(String[] args) {
        // Different ways of creating Box objects
        Box1 b1 = new Box1();           // Calls constructor 1
        Box1 b2 = new Box1(5);          // Calls constructor 2
        Box1 b3 = new Box1(2, 3, 4);    // Calls constructor 3

        // Print volumes
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
    }
}
