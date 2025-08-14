package $03_Control_Statement;

class ReturnExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Found i = " + i + ", exiting method...");
                return; // exit the method completely
            }
            System.out.println("i = " + i);
        }
        System.out.println("This will NOT run if return is triggered.");
    }
}



//public class ReturnExample {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3) {
//                System.out.println("Found i = " + i + ", exiting method.");
//                return; // exits the main method completely
//            }
//            System.out.println("i = " + i);
//        }
//        // This will never be reached if return executes
//        System.out.println("Loop finished.");
//    }
//}

