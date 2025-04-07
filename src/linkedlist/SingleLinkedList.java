package linkedlist;

// TODO
/*

7. 마지막 인덱스 데이터 삭제
* */
public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    // 6. 마지막 인덱스에 데이터 삽입 → 마지막 위치를 따로 계산해야하기 때문에 만들어야 함.
    public void insertLast(int data) {
        insertAt(size, data);
    }

    // 마지ㅣ막 인덱스 데이터 삭제
    public void deleteLast() {
        deleteAt(size - 1);
    }

    // 원하는 인덱스에 데이터 삽입
    public void insertAt(int index, int data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }
    // 4. 원하는 인덱스 데이터 제거
    public Node deleteAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
        }
        if (index == 0) {
            Node deletedNode = head;
            head = head.next;
            size--;
            return deletedNode;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node deletedNode = currentNode.next;
        currentNode.next = currentNode.next.next;
        size--;
        return deletedNode;
    }
    // 3. 원하는 인덱스 읽기
    public int getNodeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    // 1. 모든 데이터 출력
    public void printAll() {
        //처음부터 순회하면서 돌아야 하니깐
        Node currentNode = head;
        for(int i = 0; i < size; i++) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    // 2. 모든 데이터 제거
    public void clear() {
        this.head = null;
        this.size = 0;
    }
}
