package Day6;

import Day6.Node;

public class MyLinkedList {

    Node head; // Points to the first node in the list
    int size;  // Tracks the number of elements in the list

    // Inserts a new node at the beginning of the list
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);  // Create a new node with the given value
        newNode.next = head;             // Point new node's next to the current head
        head = newNode;                  // Update head to be the new node
    }

    // Inserts a new node at the end of the list
    public void insertAtLast(int value) {
        Node newNode = new Node(value);  // Create a new node with the given value

        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            return; // Exit early — no traversal needed
        }

        Node current = head;
        // Traverse until we reach the last node (where next is null)
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // Attach the new node at the end
    }

    // Inserts a new node at a specific 1-based position
    public void insertAtPosition(int position, int value) {
        Node newNode = new Node(value);  // Create a new node with the given value
        Node current = head;

        int index = 1;
        // Traverse to the node just BEFORE the target position
        while (current != null) {
            if (index == position - 1) {         // Found the node before insertion point
                newNode.next = current.next;     // New node points to the node after current
                current.next = newNode;          // Current node points to the new node
                break;                           // Stop traversal — insertion done
            }
            index++;
            current = current.next; // Move to the next node
        }
    }

    // Prints all node values from head to tail
    public void display() {
        Node current = head; // Start from the head
        while (current != null) {
            System.out.println(current.data); // Print current node's data
            current = current.next;           // Move to the next node
        }
    }

    // Removes and returns the first element of the list
    public Integer removeFirst() {
        // Guard: cannot remove from an empty list
        if (head == null) {
            System.out.println("List is empty! Cannot remove first element");
            return null;
        }

        int removedData = head.data; // Store the head's data before removing
        head = head.next;            // Move head to the next node (detaches old head)

        size--;
        System.out.println("Removed first element: " + removedData);
        return removedData;
    }

    // Removes and returns the last element of the list
    public Integer removeLast() {
        // Guard: cannot remove from an empty list
        if (head == null) {
            System.out.println("List is empty! Cannot remove last element");
            return null;
        }

        Node current = head;
        // Traverse until current is the second-to-last node
        // (current.next.next == null means current.next is the last node)
        while (current.next.next != null) {
            current = current.next;
        }

        int removedData = current.next.data; // Store the last node's data
        current.next = null;                 // Detach the last node
        size--;
        System.out.println("Removed last element: " + removedData);
        return removedData;
    }
}