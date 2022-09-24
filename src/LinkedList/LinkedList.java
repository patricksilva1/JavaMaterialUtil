package LinkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    // This is the head node or root node
    private Node<T> root;
    private int numOfItems;

    @Override
    public void insert(T data) {

        if (root == null) {

            // This is the first item in the linked list
            root = new Node<T>(data);
        } else {
            // We know that this is not the first item in the linked list
            insertBeginning(data);
        }

    }

    // We just have to update the reference O(1)
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    // Because we have to start with the root mode
    // First we have to find the last node in O(N)
    private void insertEnd(T data, Node<T> node) {

        // This is when we keep looking for the last node O(N)
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            // We have found the last node
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(T data) {
        if (root == null)
            return;

        // We want to remove the first node (root)
        if (root.getData().compareTo(data) == 0) {
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {

        // We have to find the node we want to remove
        while (actualNode != null) {
            if (actualNode.getData().compareTo(data) == 0) {
                numOfItems--;
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }


    @Override
    public void traverse() {
        if (root == null) return;
        Node<T> actualNode = root;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return numOfItems;
    }


}
