package linkedlist;

public class Main2 {
    public static void main(String[] args) {
        SingleLinkedList2 list = new SingleLinkedList2();
        list.insertAt(0, 0);
        list.printAll();
        System.out.println();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.printAll();
        System.out.println();

        Node node = list.getNodeAt(3);
        System.out.println("nodeAt = " + node.data);
        System.out.println();

        list.deleteLast();
        list.printAll();
        System.out.println();

        list.clear();





    }
}
