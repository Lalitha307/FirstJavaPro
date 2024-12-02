class Node<T> { // T is the placeholder for generic data type
    T data;      // Data of generic type
    Node<T> next; // Reference to the next node

    // Constructor
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> { // Generic LinkedList class
    private Node<T> head; // Head of the list

    // Add element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node
        if (head == null) {
            head = newNode; // If list is empty, set the new node as head
        } else {
            Node<T> temp = head;
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode; // Link the last node to the new node
        }
    }

    // Remove the first occurrence of the specified element
    public void remove(T data) {
        if (head == null) return; // If the list is empty, do nothing

        // If the head node contains the data
        if (head.data.equals(data)) {
            head = head.next; // Move head to the next node
            return;
        }

        // Search for the node to remove
        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        // If the data is found, unlink the node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display the linked list
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
