package $05_A_CloserLook_At_Methods_And_Classes;

class OverloadTypeConversion {
    void test(int a) {
        System.out.println("Called test(int): " + a);
    }

    void test(double a) {
        System.out.println("Called test(double): " + a);
    }
}

public class $02_AutoTypeConversionInOverloading {
    public static void main(String[] args) {
        OverloadTypeConversion obj = new OverloadTypeConversion();

        obj.test(5);       // int → matches test(int)
        obj.test(5.5);     // double → matches test(double)
        obj.test('A');     // char → auto converts to int (ASCII 65) → test(int)
        obj.test(10L);     // long → auto converts to double → test(double)
        obj.test(3.14f);   // float → auto converts to double → test(double)
    }
}
