import java.util.*;
class QueueMinimumElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(50);
        q.add(30);
        q.add(80);
        q.add(20);
        int min = Integer.MAX_VALUE;
        for (int x : q) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}

