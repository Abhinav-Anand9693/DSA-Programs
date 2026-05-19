class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node head = null;

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) return -1;
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class stack2 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.peek()); // 15
        s.pop();
        System.out.println(s.peek()); // 10
    }
}
