package stack;

import linkedlist.Node;
import linkedlist.SingleLinkedList2;

public class Stack {
    private final SingleLinkedList2 list;

    public Stack() {
        this.list = new SingleLinkedList2();
    }
    public void push(int data) {
        list.insertAt(0, data);
    }
    public Node pop() {
        try {
            return list.deleteAt(0);
        } catch (Exception e) {
            throw new IllegalArgumentException("데이터가 없습니다.");
        }
    }
    public Node peek() {
        return list.getNodeAt(0);
    }
    public boolean isEmpty() {
        return list.getSize() == 0;
    }
}
