package DoublyLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {

        Node<T> newNode = new Node<>(data);
        // This is the first item in the linked list
        if (tail == null) {
            // Both of the pointers are pointing to the new node
            tail = newNode;
            head = newNode;
        } else {
            // We have to insert the new item to the end of the list
            // We just have to manipulate the tail node and its references in O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }

    }

    // Let's traverse the list forward
    public void traverseForward() {
        if(this.head == null) return;
        Node<T> actualNode = this.head;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }

    }

    // Let's traverse the list backward
    public void traverseBackward() {
        if(this.tail == null) return;
        Node<T> actualNode = this.tail;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();
        }

    }


}
