package $04_Introducing_Classes;

// Box class with Parameterized Constructor
class Box6 {
    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double calculateVolume() {
        return width * height * depth;
    }
}

class ParameterizedConstructor {
    public static void main(String[] args) {

        // Creating Box objects using parameterized constructor
        Box6 mybox1 = new Box6(90,20, 1);
        Box6 mybox2 = new Box6(2, 4, 6);

        // Printing volumes
        System.out.println("Volume of Box 1: " + mybox1.calculateVolume());
        System.out.println("Volume of Box 2: " + mybox2.calculateVolume());
    }
}
