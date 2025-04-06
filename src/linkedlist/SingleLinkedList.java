package linkedlist;

// TODO
/*
4. 원하는 인덱스 데이터 제거
5. 원하는 인덱스에 데이터 삽입
6. 마지막 인덱스에 데이터 삽입 → 마지막 위치를 따로 계산해야하기 때문에 만들어야 함.
7. 마지막 인덱스 데이터 삭제
* */
public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

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
    public void deleteAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
        }


    }
    // 3. 원하는 인덱스 읽기
    public int getData(int index) {
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
    }
    // 2. 모든 데이터 제거
    public void clear() {
        this.head = null;
        this.size = 0;
    }
}
