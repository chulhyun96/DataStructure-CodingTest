package stack;

import linkedlist.Node;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Node peek = stack.peek();
        System.out.println("peek = " + peek.getData());
        System.out.println();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        boolean empty = stack.isEmpty();
        System.out.println("empty = " + empty); // false

        stack.pop();
        boolean empty2 = stack.isEmpty();
        System.out.println("empty = " + empty2); // true
    }
}
