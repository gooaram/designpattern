package io.wisoft.datastruct.stack.array;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println();
        stack.print();
    }

}
