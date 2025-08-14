package $01_DataTypes_Variable_Input;

class OneDimensionalArray {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = new int[5]; // array of size 5

        // Assign values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Access and print array elements
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Direct initialization
        int[] marks = {85, 90, 78, 88, 76};
        System.out.println("\nMarks:");
        for (int mark : marks) { // for-each loop
            System.out.println(mark);
        }
    }
}
