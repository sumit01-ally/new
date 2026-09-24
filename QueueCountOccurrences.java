import java.util.*;
class QueueCountOccurrences {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(10);
        q.add(30);
        q.add(10);
        q.add(40);
        int x = 10;
        int count = 0;
        for (int value : q) {
            if (value == x) {
                count++;
            }
        }
        System.out.println("Occurrences of " + x + ": " + count);
    }
}

