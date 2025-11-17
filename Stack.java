class Stack {
    int[] arr = new int[5];
    int top = -1;

    void push(int x) {
        if (top == 4)
            System.out.println("Overflow");
        else
            arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
