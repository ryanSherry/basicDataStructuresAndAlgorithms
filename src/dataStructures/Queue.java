public class Queue {
    static final int max = 1000;
    int front;
    int rear;
    int size;
    int capacity;
    int[] array;

    //Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    //Queue is full when size equals capacity
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    //Queue is empty when size is 0
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    //Add item
    void enqueue(int item) {
        //1. Check if full
        if (isFull(this)) {
            System.out.println("Queue is full");
            return;
        }
        //2. Change rear and size
        //???
        this.rear = (this.rear +1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        //3. Print
        System.out.println(item + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue(10);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}
