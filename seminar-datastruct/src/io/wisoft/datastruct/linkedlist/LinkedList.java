package io.wisoft.datastruct.linkedlist;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size = 0;

    public void addFirst(Object data) {
        //head는 다음 노드를 의미하므로 새로운 노드가 가리키는 데이터는 head가 되어야하고 head는 새로운노드를 의미해야하므로 새로운 노드를 넣어줌
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object data) {
        if (size == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node searchNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

//    public void addNode(Object data) {
//        Node newnode = new Node(data);
//        if(head == null) {
//            head = newnode;
//        } else {
//            newnode.next = head;
//            head = newnode;
//        }
//        size++;
//    }

    public void addIndex(int index, Object data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
        } else {
            Node temp = searchNode(index); //넣을노드
            Node temp1 = searchNode(index-1); // 이전노드
            newNode.next = temp;
            temp1.next = newNode;
            if(newNode.next == null) {
                addLast(data);
            }
        }
        size++;
    }

    public void removeNode(int index) {
        for(int i=0; i<index; i++) {

        }
    }

    public String printlist() {
        if(head == null) {
            return "[ ]";
        }

        Node node = head;
        String result = "[ ";

        while(node.next != null) {
            result += node.data + ", ";
            node = node.next;
        }

        result += node.data;

        return result + " ]";
    }

}
