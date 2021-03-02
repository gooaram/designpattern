package io.wisoft.datastruct.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.addFirst(10);
        linkedlist.addIndex(1,20);
        linkedlist.addIndex(2,30);
        linkedlist.addIndex(1,15);
        linkedlist.addLast(40);

        System.out.println(linkedlist.printlist());
    }

}