package $04_Introducing_Classes;



// Box class with Constructor
class Box5 {
    double width;
    double height;
    double depth;

    // Constructor to initialize dimensions
    Box5() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Method to calculate volume
    double calculateVolume() {
        return width * height * depth;
    }
}

class SimpleConstructor {
    public static void main(String[] args) {

        // Creating Box objects using constructor
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        // Printing volumes
        System.out.println("Volume of Box 1: " + mybox1.calculateVolume());
        System.out.println("Volume of Box 2: " + mybox2.calculateVolume());
    }
}
