package $03_Control_Statement;

class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skip this iteration and move to next
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop finished.");
    }
}

