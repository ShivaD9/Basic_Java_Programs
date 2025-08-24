package $05_A_CloserLook_At_Methods_And_Classes;

import java.util.Scanner;

public class $20_CommandLineDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many numbers they want to enter
        System.out.print("Enter number of inputs: ");
        int n = sc.nextInt();

        int[] inputs = new int[n];
        int sum = 0;

        // Taking inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = sc.nextInt();
            sum += inputs[i];
        }

        // Display results
        System.out.println("\n--- User Inputs ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + i + ": " + inputs[i]);
        }

        System.out.println("Sum of inputs: " + sum);

        sc.close();
    }
}
