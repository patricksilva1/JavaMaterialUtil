package LinkedList.LinkedListReverse;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    // This is the head node or root node
    private Node<T> root;
    private int sizeCounter;

    @Override
    public void insert(T data) {
        ++this.sizeCounter;

        if (root == null) {
            // This is the first item in the linked list
            root = new Node<>(data);
        } else {
            // We know that this is not the first item in the linked list
            insertDataBeginning(data);
        }
    }

    @Override
    public void remove(T data) {

        if (this.root == null) {
            return;
        }

        --this.sizeCounter;

        // We want to remove the first node (root)
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    @Override
    public void traverse() {

        if (this.root == null) {
            return;
        }

        Node<T> node = this.root;

        while (node != null) {
            System.out.print(node + " ");
            node = node.getNextNode();
        }
    }

    // O(1) constant time complexity, update the references.
    private void insertDataBeginning(T data) {

        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    // O(N) inserting at the end
    // Because we have to start with the root mode
    // First we have to find the last node in O(N)
    private void insertDataEnd(T data, Node<T> node) {

        // This is when we keep looking for the last node O(N)
        if (node.getNextNode() != null) {
            insertDataEnd(data, node.getNextNode());
        } else {
            // We have found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {

        // We have to find the node we want to remove
        while (actualNode != null) {
            // This is the node that we want to remove
            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                // Update the references
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.sizeCounter;
    }
}
