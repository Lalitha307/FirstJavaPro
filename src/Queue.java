public class Queue<K> {
    int n = 5; // Queue size
    K[] arr = (K[]) new Object[n]; // Array to hold elements
    int front = -1; // Points to the front of the queue
    int rear = -1;  // Points to the rear of the queue

    // Enqueue operation
    public void enqueue(K k) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) front = 0; // Initialize front if queue is empty
            rear = (rear + 1) % n; // Increment rear circularly
            arr[rear] = k; // Add the element
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued: " + arr[front]);
            if (front == rear) {
                // Reset the queue when the last element is dequeued
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % n; // Increment front circularly
            }
        }
    }

    // Peek operation
    public void peek() {
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front: " + arr[front]);
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.peek(); // Should print 10
        queue.dequeue(); // Should print 10
        queue.dequeue(); // Should print 20

        queue.enqueue(60); // Add element after dequeuing
        queue.peek(); // Should print 30

        queue.dequeue(); // Should print 30
        queue.dequeue(); // Should print 40
        queue.dequeue(); // Should print 50
        queue.dequeue(); // Should print 60
        queue.dequeue(); // Should indicate queue is empty
    }
}
