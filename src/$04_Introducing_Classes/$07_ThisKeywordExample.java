package $04_Introducing_Classes;

// Box class using 'this' keyword
class Box7 {
    double width;
    double height;
    double depth;

    // Constructor with parameters
    Box7(double width, double height, double depth) {
        // Using 'this' to refer to instance variables
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double calculateVolume() {
        return this.width * this.height * this.depth; // 'this' is optional here
    }

    // Method to compare volumes of two boxes
    boolean isBiggerThan(Box7 otherBox) {
        return this.calculateVolume() > otherBox.calculateVolume();
    }
}

class ThisKeywordExample {
    public static void main(String[] args) {
        // Create 2 boxes
        Box7 mybox1 = new Box7(5, 10, 3);
        Box7 mybox2 = new Box7(2, 4, 6);

        // Print volumes
        System.out.println("Volume of Box 1: " + mybox1.calculateVolume());
        System.out.println("Volume of Box 2: " + mybox2.calculateVolume());

        // Compare using 'this'
        if (mybox1.isBiggerThan(mybox2)) {
            System.out.println("Box 1 is bigger than Box 2");
        } else {
            System.out.println("Box 2 is bigger than or equal to Box 1");
        }
    }
}

