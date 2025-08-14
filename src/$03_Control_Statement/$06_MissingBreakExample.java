package $03_Control_Statement;

class MissingBreakExample {
    public static void main(String[] args) {

        int number = 2;

        System.out.println("Example 1: No break at all");
        switch (number) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }

        System.out.println("\nExample 2: Break in the middle");
        switch (number) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                // Missing break — execution will continue into case 3
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default case");
        }

        System.out.println("\nExample 3: Default in the middle (fall-through)");
        switch (number) {
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("Default case");
                // Missing break — execution will continue into case 3
            case 3:
                System.out.println("Case 3");
        }
    }
}
