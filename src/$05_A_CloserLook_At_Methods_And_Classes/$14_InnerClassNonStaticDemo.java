package $05_A_CloserLook_At_Methods_And_Classes;

class Outer2 {
    int outerVar = 200;

    // Inner (non-static) Class
    class Inner {
        void show() {
            System.out.println("Inside Inner Class, outerVar = " + outerVar);
        }
    }
}

public class $14_InnerClassNonStaticDemo {
    public static void main(String[] args) {
        Outer2 outerObj = new Outer2();
        Outer2.Inner innerObj = outerObj.new Inner(); // needs outer object
        innerObj.show();
    }
}
