public class LinkedList {
    int size = 0;
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeg(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtEnd(int data) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        Node newNode = new Node(data);
        node.next = newNode;
        size++;
    }

    public void insertAtAny(int data, int index) {
        if (index > size) {
            System.out.println("Node doesn't exist");
            return;
        }
        if (index == 0) {
            insertAtBeg(data);
        } else if (index == size) {
            insertAtEnd(data);
        } else {
            Node node = head.next;
            Node previousNode = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
                previousNode = previousNode.next;
            }
            Node newNode = new Node(data);
            previousNode.next = newNode;
            newNode.next = node;
            size++;
        }
    }

    public int deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty!!");
            return -1;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int deleteAtLast() {
        if (head == null) {
            System.out.println("List is Empty!!");
            return -1;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        int data = node.next.data;
        node.next = null;
        size--;
        return data;
    }

    public int deleteAtAny(int index) {
        if (head == null) {
            System.out.println("List is Empty!!");
            return -1;
        }
        if (index > size) {
            System.out.println("Node doesn't exist");
            return -1;
        }
        if (index == 0) {
            deleteAtFirst();
        }
        if (index == size) {
            deleteAtLast();
        }
        Node node = head.next;
        Node prNode = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
            prNode = prNode.next;
        }
        int data = node.data;
        prNode.next = node.next;
        size--;
        return data;
    }

    public void linkedListTraversal() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeg(5);
        list.insertAtBeg(4);
        list.insertAtBeg(3);
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtEnd(0);
        list.insertAtAny(7, 6);
        list.linkedListTraversal();
        System.out.println(list.deleteAtFirst());
        list.linkedListTraversal();
        System.out.println(list.deleteAtLast());
        list.linkedListTraversal();
        System.out.println(list.deleteAtAny(2));
        list.linkedListTraversal();
        System.out.println(list.size);
    }
}
