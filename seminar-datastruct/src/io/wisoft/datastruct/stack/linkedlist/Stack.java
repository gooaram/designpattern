package io.wisoft.datastruct.stack.linkedlist;

import java.util.NoSuchElementException;

public class Stack {

    private Node top;

    public Object pop() {
        if (top == null) throw new NoSuchElementException();
        Object result = top.data;
        top = top.next;

        return result;
    }

    public void push(Object item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public Object peek() {
        if (top == null) throw new NoSuchElementException();

        return top.data;
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }

    public void print() {
        if(top == null) {
            System.out.println("빈 스택입니다.");
        }
        else {
            System.out.print(top.data);
            top = top.next;
            while (top != null) {
                System.out.print(" -> ");
                System.out.print(top.data);
                top = top.next;
            }
            System.out.println();
        }

    }

}
