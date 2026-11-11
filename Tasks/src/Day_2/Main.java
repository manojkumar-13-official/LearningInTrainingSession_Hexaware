package Day_2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtFirst(5);
        list.addAtPosition(2,15);
        list.deleteAtLast();
        list.deleteAtFirst();
        list.show();
    }
}