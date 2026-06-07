
    import java.util.ArrayList;

class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    // Push operation
    public void push(int data) {
        list.add(data);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) return -1;
        return list.get(list.size() - 1);
    }

    // isEmpty
    public boolean isEmpty() {
        return list.size() == 0;
    }
}
     public class stack1 {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek()); // 30
        s.pop();
        System.out.println(s.peek()); // 20
    }
}

    

