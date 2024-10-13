package Java.Queue;

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
        System.out.println("Enqueue " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Array is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        System.out.println("Dequeue " + item);
        return item;
    }

    public boolean isFull() {
        return capacity == count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
