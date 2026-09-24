import java.util.*;
class QueueMaximumElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(50);
        q.add(30);
        q.add(80);
        q.add(20);
        int max = Integer.MIN_VALUE;
        for (int x : q) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Maximum Element: " + max);
    }
}
