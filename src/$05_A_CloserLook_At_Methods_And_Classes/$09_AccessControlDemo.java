package $05_A_CloserLook_At_Methods_And_Classes;

class AccessExample {
    public int pubVar = 10;       // Public
    protected int proVar = 20;    // Protected
    int defVar = 30;              // Default (package-private)
    private int priVar = 40;      // Private

    public void pubMethod() {
        System.out.println("Public Method: pubVar = " + pubVar);
    }

    protected void proMethod() {
        System.out.println("Protected Method: proVar = " + proVar);
    }

    void defMethod() {
        System.out.println("Default Method: defVar = " + defVar);
    }

    private void priMethod() {
        System.out.println("Private Method: priVar = " + priVar);
    }

    // Helper to show private access from within the same class
    public void showPrivateAccess() {
        System.out.println("Accessing Private inside class: " + priVar);
        priMethod();
    }
}

public class $09_AccessControlDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        System.out.println("--- Accessing from Main (Same Package) ---");
        System.out.println("Public var: " + obj.pubVar);   // ✅ allowed
        System.out.println("Protected var: " + obj.proVar); // ✅ allowed
        System.out.println("Default var: " + obj.defVar);   // ✅ allowed
        // System.out.println("Private var: " + obj.priVar); // ❌ not allowed

        obj.pubMethod();    // ✅
        obj.proMethod();    // ✅
        obj.defMethod();    // ✅
        // obj.priMethod(); // ❌ not allowed

        obj.showPrivateAccess(); // ✅ indirect private access
    }
}
