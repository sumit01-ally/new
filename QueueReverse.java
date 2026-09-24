import java.util.*;
class QueueReverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        Stack<Integer> s = new Stack<>();
        // Move queue elements to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        // Move stack elements back to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        // Display reversed queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}