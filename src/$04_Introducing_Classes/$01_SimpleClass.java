package $04_Introducing_Classes;

// A simple Box class
class Box2 {
    double width;
    double height;
    double depth;
}

class SimpleClass {
    // Main method to test the class
    public static void main(String[] args) {

        // Create an object of Box
        Box2 myBox = new Box2();
        double volume;

        // Assign values
        myBox.width = 5;
        myBox.height = 10;
        myBox.depth = 3;

        // Compute volume of box
        volume = myBox.width * myBox.height * myBox.depth;

        // Print volume
        System.out.println("Volume of the box: " + volume);
    }
}
