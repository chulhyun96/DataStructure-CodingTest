package set;

import linkedlist.Node;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Node> hashSet = new HashSet<>();
        hashSet.add(new Node(1));
        hashSet.add(new Node(2));
        hashSet.add(new Node(3));
        hashSet.add(new Node(4));
        hashSet.add(new Node(5));
        System.out.println("hashSet = " + hashSet);

        HashSet<Node> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Node(1));
        linkedHashSet.add(new Node(2));
        linkedHashSet.add(new Node(3));
        linkedHashSet.add(new Node(4));
        linkedHashSet.add(new Node(5));
        System.out.println("linkedHashSet = " + linkedHashSet);


        TreeSet<Node> nodes = new TreeSet<>(Comparator.reverseOrder());
        nodes.add(new Node(1));
        nodes.add(new Node(2));
        nodes.add(new Node(3));
        nodes.add(new Node(4));
        nodes.add(new Node(5));
        System.out.println("nodes = " + nodes);

    }
}
