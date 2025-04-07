package linkedlist;

/*
* 1. 모든 데이터 출력
2. 모든 데이터 제거
3. 원하는 인덱스 읽기
4. 원하는 인덱스 데이터 제거
5. 원하는 인덱스에 데이터 삽입
    1. 생각해야 하는 논리
        1. 원하는 인덱스의 위치까지 가기 위해서 for문
        2. 원하는 위치까지 도달 후 현재 위치의 node의 next노드와 newNode의 연결
        3. 그 후 원하는 위치의 node와 newNode의 연결
    2. 새로운 노드를 중간 인덱스에 삽입하기 위해서는 연결을 해줘야 하기 때문에 **새로운 노드를 맨 앞에서부터 원하는 인덱스 위치까지 순회해가면서 삽입해줘야 하기 때문**
6. 마지막 인덱스에 데이터 삽입 → 마지막 위치를 따로 계산해야하기 때문에 만들어야 함.
7. 마지막 인덱스 데이터 삭제*/
public class SingleLinkedList2 {
    private Node head;
    private int size;

    public SingleLinkedList2() {
        this.head = null;
        this.size = 0;
    }

    // 모든 데이터 출력
    public void printAll() {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.data + " " );
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // 모든 데이터 체거
    public void clear() {
        this.head = null;
        this. size = 0;
    }
    // 원하는 인덱스 읽기
    public Node getNodeAt(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("유효한 범위가 아닙니다.");
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
    // 원하는 데이터 제거
    public Node deleteAt(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("유효한 범위가 아닙니다.");
        }
        if (index == 0) {
            Node deleteNode = head;
            head = head.next;
            size--;
            return deleteNode;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node deleteNode = currentNode.next;
        currentNode.next = currentNode.next.next;
        size--;
        return deleteNode;
    }

    // 원하는 인덱스에 데이터 삽입
    public void insertAt(int index, int data) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("유효한 범위가 아닙니다.");
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
    // 마지막 인덱스에 데이터 삽입
    public void insertLast(int data) {
        insertAt(size, data);
    }
    // 마지막 인덱스 데이터 삭제
    public void deleteLast() {
        deleteAt(size - 1);
    }
}
