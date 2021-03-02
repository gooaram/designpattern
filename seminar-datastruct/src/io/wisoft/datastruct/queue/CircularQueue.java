package io.wisoft.datastruct.queue;

public class CircularQueue {

    int MAX_SIZE;
    static int rear = 0;
    static int front = 0;
    Object[] data;

    public CircularQueue(int maxSize) {
        this.MAX_SIZE = maxSize;
        data = new Object[this.MAX_SIZE];
    }

    public void add(Object datum) {
        if ((rear + 1) % MAX_SIZE == front) {
            System.out.println("full");
        } else {
            rear = (rear + 1) % MAX_SIZE;
            this.data[rear] = datum;
        }
    }

    public Object poll() {
        front = (front + 1) % MAX_SIZE;
        Object result = data[front];
        data[front] = null;
        return result;
    }

    public void print() {

    }

}
