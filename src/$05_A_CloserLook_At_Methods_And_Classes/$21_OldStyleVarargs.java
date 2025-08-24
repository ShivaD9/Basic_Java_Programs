package $05_A_CloserLook_At_Methods_And_Classes;

class OldStyleVarargs {
    // Old style: explicitly using array
    static void show(int nums[]) {
        System.out.print("Number of arguments: " + nums.length + " | Values: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show(new int[]{10, 20, 30});
        show(new int[]{1, 2});
        show(new int[]{}); // no arguments
    }
}
