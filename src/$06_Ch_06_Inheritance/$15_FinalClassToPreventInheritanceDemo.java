package Ch_06_Inheritance;

// Final class (cannot be extended)
final class Vehicle {
    void type() {
        System.out.println("This is a vehicle.");
    }
}

// ❌ ERROR: Cannot inherit from final class Vehicle
// class Car extends Vehicle {
//     void type() {
//         System.out.println("This is a car.");
//     }
// }

class Bike {
    void type() {
        System.out.println("This is a bike.");
    }
}

public class $15_FinalClassToPreventInheritanceDemo {
        public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.type();

        Bike b = new Bike();
        b.type();
    }
}
