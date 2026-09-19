class StackUsingArray {
    int stack[];
    int top;
    int size;
    StackUsingArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }
    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return top == size - 1;
    }
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.peek();
        System.out.println("Is Stack Empty? " + s.isEmpty());
        System.out.println("Is Stack Full? " + s.isFull());
    }
}