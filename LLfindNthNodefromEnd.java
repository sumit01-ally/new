class LLfindNthNodefromEnd {

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

    // Find Nth node from end
    void findNthFromEnd(int n) {

        Node temp = head;
        int length = 0;

        // Find length
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (n <= 0 || n > length) {
            System.out.println("Invalid position");
            return;
        }

        // Move to Nth node from beginning
        temp = head;

        for (int i = 1; i <= length - n; i++) {
            temp = temp.next;
        }

        System.out.println(n + "th node from end = " + temp.data);
    }

    public static void main(String[] args) {
        LLfindNthNodefromEnd list = new LLfindNthNodefromEnd();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.findNthFromEnd(2);
    }
}