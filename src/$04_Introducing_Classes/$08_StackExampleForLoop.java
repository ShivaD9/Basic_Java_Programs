package $04_Introducing_Classes;

// Stack class
class Stack {
    int maxSize;
    int top;
    int[] stackArray;

    // Constructor
    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method
    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stackArray[++top] = item;
            System.out.println(item + " pushed.");
        }
    }

    // Pop method
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == maxSize - 1);
    }
}

// Main class
class StackExampleForLoop {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        // Push using for loop
        for (int i = 1; i <= 5; i++) {
            myStack.push(i * 10); // pushes 10,20,30,40,50
        }

        System.out.println();

        // Pop using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Popped: " + myStack.pop());
        }
    }
}
