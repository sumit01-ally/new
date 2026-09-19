class StackReverse {
    int[] stack;
    int top;
    int size;
    StackReverse(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int value) {
        stack[++top] = value;
    }
    void reverse() {
        int start = 0;
        int end = top;
        while (start < end) {
            int temp = stack[start];
            stack[start] = stack[end];
            stack[end] = temp;
            start++;
            end--;
        }
    }
    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
    public static void main(String[] args) {
        StackReverse s = new StackReverse(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print("Original Stack: ");
        s.display();
        s.reverse();
        System.out.print("\nReversed Stack: ");
        s.display();
    }
}