package linkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList2 list = new SingleLinkedList2();

        list.insertAt(0, 0);
        list.insertAt(1, 1);
        list.insertAt(2, 2);
        list.insertAt(3, 3);
        list.printAll();

        System.out.println("list.deleteAt(1) = " + list.deleteAt(1).data);
        list.printAll(); // 0 -> 2 -> 3
        System.out.println("list.deleteAt(2).data = " + list.deleteAt(2).data);
        list.printAll(); // 0 -> 2

        list.insertLast(3);
        list.printAll(); // 0 -> 2 -> 3
        list.insertLast(9);
        list.printAll(); // 0 -> 2 -> 3 -> 9

        list.deleteLast();
        list.printAll(); // 0 -> 2 -> 3

        list.deleteLast();
        list.printAll(); // 0 -> 2

        list.deleteAt(0);
        list.printAll(); // 2
        System.out.println("list.getNodeAt(0) = " + list.getNodeAt(0));


    }
}
