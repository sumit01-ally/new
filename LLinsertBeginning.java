class LLinsertBeginning {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at beginning
    void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Display Linked List
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLinsertBeginning list = new LLinsertBeginning();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.println("Linked List:");
        list.display();
    }
}