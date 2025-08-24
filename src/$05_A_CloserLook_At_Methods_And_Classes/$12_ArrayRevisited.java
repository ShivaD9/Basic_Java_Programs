package $05_A_CloserLook_At_Methods_And_Classes;

public class $12_ArrayRevisited {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 10, 15, 20, 25};

        // 1. Accessing elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 2. Traversing array with for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 3. Traversing with for-each loop
        System.out.print("Using for-each: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 4. Modifying array elements
        numbers[2] = 99; // change third element
        System.out.println("After modification: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 5. Passing array to method
        printArray(numbers);

        // 6. Returning array from method
        int[] squared = squareArray(numbers);
        System.out.print("Squared array: ");
        for (int n : squared) {
            System.out.print(n + " ");
        }
    }

    // Method to print array (array passed as parameter)
    static void printArray(int[] arr) {
        System.out.print("Inside printArray: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Method returning an array
    static int[] squareArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }
}
