import java.util.*;
class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x) {
        s1.push(x);
    }
    int dequeue() {
        if (empty()) {
            return -1;
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int value = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return value;
    }
    int peek() {
        if (empty()) {
            return -1;
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int value = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return value;
    }
    boolean empty() {
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
        System.out.println("Empty: " + q.empty());
    }
}
