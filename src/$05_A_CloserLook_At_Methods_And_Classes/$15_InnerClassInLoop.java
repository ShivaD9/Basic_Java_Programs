package $05_A_CloserLook_At_Methods_And_Classes;

public class $15_InnerClassInLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            // Inner class inside loop
            class LoopInner {
                void print(int num) {
                    System.out.println("Loop iteration " + num);
                }
            }

            // Create object of inner class
            LoopInner obj = new LoopInner();
            obj.print(i);
        }
    }
}
