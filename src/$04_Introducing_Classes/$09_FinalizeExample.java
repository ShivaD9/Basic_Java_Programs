package $04_Introducing_Classes;

class DemoFinalize {
    private String name;

    DemoFinalize(String name) {
        this.name = name;
    }

    // finalize() method (deprecated, so suppress warnings)
    @Override
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("Finalize called for object: " + name);
    }
}

class FinalizeExample {
    public static void main(String[] args) {
        // Create objects
        @SuppressWarnings("unused")
        DemoFinalize obj1 = new DemoFinalize("Object1");
         @SuppressWarnings("unused")
        DemoFinalize obj2 = new DemoFinalize("Object2");

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Suggest Garbage Collector to run
        System.gc();

        System.out.println("Main method ends...");
    }
}
