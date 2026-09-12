import java.util.HashSet;

class LLRemoveDuplicatesfromUnsortedlist {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at end
    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Remove duplicates
    void removeDuplicates() {

        HashSet<Integer> set = new HashSet<>();

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if (set.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                set.add(temp.data);
                prev = temp;
            }

            temp = temp.next;
        }
    }

    // Display
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLRemoveDuplicatesfromUnsortedlist list = new LLRemoveDuplicatesfromUnsortedlist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(10);
        list.addLast(30);
        list.addLast(20);
        list.addLast(40);
        System.out.println("Before removing duplicates:");
        list.display();
        list.removeDuplicates();
        System.out.println("After removing duplicates:");
        list.display();
    }
}