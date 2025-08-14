package $03_Control_Statement;



class NestedSwitchExample {
    public static void main(String[] args) {
        String branch = "CSE";
        int year = 2;

        switch (year) {
            case 1:
                System.out.println("Subjects: English, Maths, Science");
                break;
            case 2:
                switch (branch) {
                    case "CSE":
                        System.out.println("Subjects: Data Structures, Computer Organization");
                        break;
                    case "ECE":
                        System.out.println("Subjects: Microprocessors, Circuit Theory");
                        break;
                    case "MECH":
                        System.out.println("Subjects: Thermodynamics, Fluid Mechanics");
                        break;
                    default:
                        System.out.println("Branch not found");
                }
                break;
            default:
                System.out.println("Year not found");
        }
    }
}

