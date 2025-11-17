class Queue {
    int[] q = new int[5];
    int front = 0, rear = 0, size = 0;

    void enqueue(int x) {
        if (size == 5) System.out.println("Overflow");
        else {
            q[rear] = x;
            rear = (rear + 1) % 5;
            size++;
        }
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        int x = q[front];
        front = (front + 1) % 5;
        size--;
        return x;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5); q.enqueue(10); q.enqueue(15);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
