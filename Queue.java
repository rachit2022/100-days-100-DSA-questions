public class Queue {
    private final int default_size = 10;
    int rear = -1;
    int front = 0;
    int[] arr;

    Queue(int size) {
        arr = new int[size];
    }

    Queue() {
        arr = new int[default_size];
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        front++;
        return data;
    }

    public void queueTraversal() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.queueTraversal();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.queueTraversal();
    }
}