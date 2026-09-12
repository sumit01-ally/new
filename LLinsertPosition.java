class LLinsertPosition {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at given position
    void insert(int data, int position) {
        Node newNode = new Node(data);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to node before the given position
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
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
        LLinsertPosition list = new LLinsertPosition();
        list.insert(10, 1);
        list.insert(20, 2);
        list.insert(30, 3);
        System.out.println("Before insertion:");
        list.display();
        list.insert(25, 3);
        System.out.println("After insertion:");
        list.display();
    }
}