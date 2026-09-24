import java.util.*;
class QueueSearchElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int search = 30;
        boolean found = false;

        for (int x : q) {
            if (x == search) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}

