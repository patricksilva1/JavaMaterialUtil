package DoublyLinkedList;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList<String> names = new DoublyLinkedList<String>();

        names.insert("Alex");
        names.insert("Bane");
        names.insert("Carlos");

        System.out.println("Backward:");

        names.traverseBackward();

        System.out.println("Forward:");

        names.traverseForward();

    }

}
