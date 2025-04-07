package linkedlist;

public class Node implements Comparable<Node> {
    Node next;
    int data;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", data=" + data +
                '}';
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.data, o.data);
    }
}
