package $01_DataTypes_Variable_Input;


class BlockScopeExample {
    public static void main(String[] args) {

        int x = 10; // Variable in main method scope
        System.out.println("Outside block : Value of x = " + x);

        {
            // This is a new block
            int y = 20; // y exists only inside this block
            System.out.println("Inside block : Value of x = " + x); // can access x
            System.out.println("Inside block : Value of y = " + y); // y is accessible here
        }

        // y is NOT accessible here
        // System.out.println(y); // ❌ Compile error: y cannot be resolved

        // Another block
        {
            int z = 30;
            System.out.println("Inside another block: x = " + x);
            System.out.println("Inside another block: z = " + z);
        }

        // z is also NOT accessible here
        // System.out.println(z); // ❌ Compile error
    }
}

/*
📌 Block Scope in Java:
-----------------------
1. Variables declared inside { } can only be accessed within that block.
2. Outer scope variables can be accessed inside inner blocks.
3. Once the block ends, variables inside it are destroyed.
4. Commonly seen in loops, if-else, and method definitions.
*/
