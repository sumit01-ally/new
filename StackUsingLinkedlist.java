class StackUsingLinkedlist {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    Node top = null;
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    void pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped: " + top.data);
            top = top.next;
        }
    }
    void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top: " + top.data);
        }
    }
    void display() {
        Node temp = top;

        if (temp == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedlist s = new StackUsingLinkedlist();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}