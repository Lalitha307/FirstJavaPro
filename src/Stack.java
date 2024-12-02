public class Stack<K> {
    // Type casting for generic stack
    int n = 5; // Stack size
    K[] arr = (K[]) new Object[n]; // Stack array
    int top = -1; // Initialize top to -1

    // Push operation
    public void push(K k) {
        if (top + 1 >= arr.length) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = k; // Pre-increment and insert
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]); // Print the top element
            top--; // Decrement top
        }
    }

    // Peek operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]); // Print the top element
        }
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek(); // Should print 30
        stack.pop(); // Should print 30
        stack.pop(); // Should print 20
        stack.pop(); // Should print 10
        stack.pop(); // Should indicate stack is empty
    }
}
