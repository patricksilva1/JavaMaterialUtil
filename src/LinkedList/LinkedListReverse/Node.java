package LinkedList.LinkedListReverse;

public class Node<T extends Comparable<T>> {

    // This is the data we store in the data structure.
    private T data;

    // This is why linked lists need more memory than arrays.
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    // #region Getters and Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    // #endregion

    @Override
    public String toString() {
        return this.data.toString();
    }
}
