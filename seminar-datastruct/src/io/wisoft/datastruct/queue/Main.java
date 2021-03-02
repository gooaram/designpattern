package io.wisoft.datastruct.queue;

public class Main {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.print();
        circularQueue.poll();
        circularQueue.poll();
        circularQueue.print();

    }

}
