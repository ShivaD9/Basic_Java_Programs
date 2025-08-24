package Ch_06_Inheritance;

// Base class
class Person {
    String name;

    // Constructor
    Person(String n) {
        name = n;
        System.out.println("Person constructor called: Name = " + name);
    }
}

// Derived class
class Employee extends Person {
    int empId;

    // Constructor
    Employee(String n, int id) {
        super(n); // call Person(String n)
        empId = id;
        System.out.println("Employee constructor called: ID = " + empId);
    }
}

// More Derived class
class Manager extends Employee {
    String department;

    // Constructor
    Manager(String n, int id, String dept) {
        super(n, id); // call Employee(String n, int id)
        department = dept;
        System.out.println("Manager constructor called: Department = " + department);
    }
}

// Main class
public class $06_SuperConstructor_Example {
    public static void main(String[] args) {
        Manager m = new Manager("Vaishnavi", 101, "IT");
    }
}
