package $04_Introducing_Classes;

// A simple Box class
class Box2 {
    double width;
    double height;
    double depth;

    // Method to compute volume
    void getVolume() {
        System.out.println("Volume of the box: ");
        System.out.println(width * height * depth);
    }
}

class SimpleMethod {
    public static void main(String[] args) {

        // Create an object of Box
        Box2 myBox = new Box2();

        // Assign values
        myBox.width = 5;
        myBox.height = 10;
        myBox.depth = 3;

        // Call method instead of calculating manually
        myBox.getVolume();

    }
}

