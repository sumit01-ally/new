class QueueCircular {
    int arr[];
    int front, rear;
    int size;
    QueueCircular(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = value;
        }
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + arr[front]);

            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
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
        return (rear + 1) % size == front;
    }
    public static void main(String[] args) {
        QueueCircular q = new QueueCircular(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.front();
        q.rear();
        q.dequeue();
        q.dequeue();
        q.enqueue(60);
        q.enqueue(70);
        q.front();
        q.rear();
    }
}
