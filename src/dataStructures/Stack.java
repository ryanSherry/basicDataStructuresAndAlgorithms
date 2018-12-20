public class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    //Is list empty?
    boolean isEmpty() {
        return (top > 0);
    }

    //Constructor
    Stack() {
        top = -1;
    }

    //Push elements to stack
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    //Pop element from stack
    int pop() {
        if (top <= 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

}
