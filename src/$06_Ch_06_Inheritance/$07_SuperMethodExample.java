package Ch_06_Inheritance;

// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        super.sound(); // Call superclass method
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    @Override
    void sound() {
        super.sound(); // Call superclass method
        System.out.println("Cat meows");
    }
}

// Main class
public class $07_SuperMethodExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        System.out.println();

        Cat c = new Cat();
        c.sound();
    }
}
