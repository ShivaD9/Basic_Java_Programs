package $05_A_CloserLook_At_Methods_And_Classes;

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Method showing Call by Value
    void modifyValues(int x, int y) {
        x *= 2;
        y /= 2;
        System.out.println("Inside modifyValues: x = " + x + ", y = " + y);
    }

    // Method showing Call by Reference (object reference is passed)
    void modifyObject(Test obj) {
        obj.a *= 2;
        obj.b /= 2;
        System.out.println("Inside modifyObject: a = " + obj.a + ", b = " + obj.b);
    }
}

public class $05_ArgumentPassingDemo {
    public static void main(String[] args) {
        Test t1 = new Test(10, 20);

        // ---- Call by Value ----
        int x = 5, y = 10;
        System.out.println("Before modifyValues: x = " + x + ", y = " + y);
        t1.modifyValues(x, y);
        System.out.println("After modifyValues: x = " + x + ", y = " + y); // No change

        System.out.println();

        // ---- Call by Reference (object reference passed) ----
        System.out.println("Before modifyObject: a = " + t1.a + ", b = " + t1.b);
        t1.modifyObject(t1);
        System.out.println("After modifyObject: a = " + t1.a + ", b = " + t1.b); // Values changed
    }
}

