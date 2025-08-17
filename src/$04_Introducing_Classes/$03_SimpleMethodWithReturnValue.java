package $04_Introducing_Classes;

// Box class
class Box3 {
    double width;
    double height;
    double depth;

    // Method that RETURNS the volume
    double calculateVolume() {
        return width * height * depth;
    }
}

class SimpleMethodWithReturnValue {
    public static void main(String[] args) {

        // First Box
        Box3 mybox1 = new Box3();
        mybox1.width = 5;
        mybox1.height = 10;
        mybox1.depth = 3;

        // Second Box
        Box3 mybox2 = new Box3();
        mybox2.width = 2;
        mybox2.height = 4;
        mybox2.depth = 6;

        // Call methods
        double volume1 = mybox1.calculateVolume();
        double volume2 = mybox2.calculateVolume();

        // Print volumes
        System.out.println("Volume of Box 1: " + volume1);
        System.out.println("Volume of Box 2: " + volume2);
    }
}

