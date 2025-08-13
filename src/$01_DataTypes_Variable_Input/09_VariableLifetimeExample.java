package $01_DataTypes_Variable_Input;

class VariableLifetimeExample {
    public static void main(String[] args) {

        System.out.println("Program Start");

        // Loop demonstrating variable lifetime
        for (int i = 1; i <= 3; i++) {
            int count = 0; // count is created at the start of each loop iteration
            count++;       // increment count
            System.out.println("Iteration " + i + ": count = " + count);
        }

        // count is not accessible here because it was destroyed after each loop iteration
        // System.out.println(count); // ❌ Compile error

        System.out.println("Program End");
    }
}

/*
📌 Lifetime of a Variable:
--------------------------
1. Local variables (declared inside methods/blocks) are created when execution enters the block
   and destroyed when the block ends.
2. Instance variables (declared in a class but outside methods) live as long as the object exists.
3. Static variables live for the entire duration of the program.
4. In this example, 'count' is re-created in each loop iteration, so its value resets each time.
*/
