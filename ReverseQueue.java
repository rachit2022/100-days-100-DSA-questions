import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            queue.add(val);
            stack.push(val);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + " ");
        }
        sc.close();
    }
}
