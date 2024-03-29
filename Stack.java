public class Stack {
    int size;
    int[] arr;
    int data;
    int top = -1;

    Stack(int size) {
        size = this.size;
        arr = new int[this.size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = arr[top];
        top--;
        return data;
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        System.out.println(s.pop());
        s.push(10);
    }
}
