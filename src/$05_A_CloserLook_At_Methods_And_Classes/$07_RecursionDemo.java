package $05_A_CloserLook_At_Methods_And_Classes;

class RecursionExample {
    // Recursive method to calculate factorial
    int factorial(int n) {
        if (n == 1) {  // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}

public class $07_RecursionDemo {
    public static void main(String[] args) {
        RecursionExample obj = new RecursionExample();
        
        System.out.println("Factorial of 5: " + obj.factorial(5));
        System.out.println("Factorial of 7: " + obj.factorial(7));
    }
}
