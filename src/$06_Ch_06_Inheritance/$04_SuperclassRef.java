package Ch_06_Inheritance;

package Ch_06_Inheritance;

// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void guard() {
        System.out.println("Dog is guarding the house");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
    void scratch() {
        System.out.println("Cat is scratching");
    }
}

// Main class
public class $04_SuperclassRef {
    public static void main(String[] args) {
        // Superclass reference, subclass object
        Animal a;

        a = new Dog();   // Animal reference → Dog object
        a.sound();       // Calls Dog's overridden method
        // a.guard();    // ❌ ERROR: not in Animal class

        a = new Cat();   // Animal reference → Cat object
        a.sound();       // Calls Cat's overridden method
        // a.scratch();  // ❌ ERROR: not in Animal class

        System.out.println("\n--- Using subclass reference ---");
        Dog d = new Dog();
        d.sound();   // Dog’s version
        d.guard();   // Allowed (Dog’s own method)

        Cat c = new Cat();
        c.sound();   // Cat’s version
        c.scratch(); // Allowed (Cat’s own method)
    }
}

