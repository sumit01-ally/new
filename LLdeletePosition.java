class LLdeletePosition {

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

    // Delete node at given position
    void delete(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to node before the position
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Delete node
        temp.next = temp.next.next;
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
        LLdeletePosition list = new LLdeletePosition();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println("Before deletion:");
        list.display();
        list.delete(3);
        System.out.println("After deletion:");
        list.display();
    }
}