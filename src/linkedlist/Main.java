package linkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insertAt(0, 1);
        list.insertAt(1, 2);
        list.insertAt(2, 3);
        list.insertAt(3, 4);
        list.printAll();
        System.out.println("list.getIndex(2) = " + list.getData(2));
        System.out.println("list.getIndex(3) = " + list.getData(3));


    }
}
