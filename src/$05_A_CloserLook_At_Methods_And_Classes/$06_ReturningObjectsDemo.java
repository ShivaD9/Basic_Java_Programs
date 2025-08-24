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

    // Method returning a new Box with doubled dimensions
    Box doubleDimensions() {
        return new Box(width * 2, height * 2, depth * 2);
    }

    // Method returning a new Box as a cube
    Box makeCube(int side) {
        return new Box(side, side, side);
    }
}

public class $06_ReturningObjectsDemo {
    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);

        System.out.println("Original Volume: " + b1.volume());

        // Returning a new object
        Box b2 = b1.doubleDimensions();
        System.out.println("Volume of doubled box: " + b2.volume());

        // Returning a cube object
        Box cube = b1.makeCube(5);
        System.out.println("Volume of cube: " + cube.volume());
    }
}
