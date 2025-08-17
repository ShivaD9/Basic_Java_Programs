package $04_Introducing_Classes;

// Box class
class Box4 {
    double width;
    double height;
    double depth;

    // Method to set dimensions using parameters
    void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method that returns volume
    double calculateVolume() {
        return width * height * depth;
    }
}

class SimpleMethodWithParameters {
    public static void main(String[] args) {

        // First Box object
        Box4 mybox1 = new Box4();
        mybox1.setDimensions(5, 10, 3);   // Using setDimensions()

        // Second Box object
        Box4 mybox2 = new Box4();
        mybox2.setDimensions(2, 4, 6);    // Using setDimensions()

        // Calculate and print volumes
        System.out.println("Volume of Box 1: " + mybox1.calculateVolume());
        System.out.println("Volume of Box 2: " + mybox2.calculateVolume());
    }
}
