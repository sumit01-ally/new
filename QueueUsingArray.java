class QueueUsingArray {
    int arr[];
    int front, rear;
    int size;
    QueueUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = value;
        }
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + arr[front]);
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }
    void front() {
        if (isEmpty())
            System.out.println("Queue is Empty");
        else
            System.out.println("Front: " + arr[front]);
    }
    void rear() {
        if (isEmpty())
            System.out.println("Queue is Empty");
        else
            System.out.println("Rear: " + arr[rear]);
    }
    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return rear == size - 1;
    }
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.front();
        q.rear();
        q.dequeue();
        q.front();
        q.rear();
        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());
    }
}
