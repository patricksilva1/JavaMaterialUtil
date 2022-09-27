package LinkedList;

public class App {

    public static void main(String[] arg) {

        LinkedList<String> names = new LinkedList<String>();

        names.insert("Adam");
        names.insert("Daniel");
        names.insert("Ana");

        names.traverse();
        names.remove("Ana");
        names.traverse();
    }


}
