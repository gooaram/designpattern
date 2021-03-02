package io.wisoft.datastruct.stack.array;

public class Stack {

    public int MaxSize;
    public int top;
    public Object[] stack;

    public Stack(int MaxSize) {
        this.MaxSize = MaxSize;
        stack = new Object[MaxSize];
        top = -1;
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

    public void push(Object item) {
        stack[++top] = item;
    }

    public Object pop() {
        if(top == -1) System.out.println("스택이 비어있습니다.");
        Object result = stack[top];
        stack[top] = null;
        top--;
        return result;
    }

    public Object peek() {
        return stack[top];
    }

    public void print() {
        if(top == -1) System.out.println("스택이 비어있습니다.");
        for(int i=top; i>-1; i--) {
            System.out.println(stack[i]);
        }
    }

}
