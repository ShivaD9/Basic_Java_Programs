package $05_A_CloserLook_At_Methods_And_Classes;

class Fibonacci {
    int fib(int n) {
        if (n <= 1)  // Base case
            return n;
        return fib(n - 1) + fib(n - 2); // Recursive case
    }
}

public class $08_FibonacciRecursion {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        for (int i = 0; i < 7; i++) {
            System.out.print(f.fib(i) + " ");
        }
    }
}
