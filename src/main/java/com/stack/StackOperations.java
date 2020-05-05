package com.stack;

public class StackOperations<E> implements StackInterface<E> {

    private int top = 0;
    private int capacity;
    private Object[] stackArray;

    public StackOperations(int capacity) {
        this.capacity = capacity;
        stackArray = new Object[capacity];
    }

    @Override
    public boolean push(E item) {
        if (this.top >= this.capacity - 1) {
            System.out.println("Stack is full");
            this.increaseStackCapacity();
        }
        // System.out.println("Push items in stack :: "+item);
        this.stackArray[++top] = item;
        return true;
    }

    private void increaseStackCapacity() {
        this.capacity = this.capacity * 2;
        E[] newStack = (E[]) new Object[this.capacity];
        for (int i = 0; i < stackArray.length; i++) {
            newStack[i] = (E) stackArray[i];
        }
        this.stackArray = newStack;
    }

    @Override
    public E pop() {
        if (this.top == -1)
            System.out.println("Stack underflow");
        E removedItem = (E) stackArray[top--];
        // System.out.println("Pop items in stack :: "+removedItem);
        return removedItem;
    }

    @Override
    public E peek() {
        if (this.top == -1)
            System.out.println("Stack underflow");
        E topItem = (E) stackArray[top];
        //System.out.println("Peek item :: "+topItem);
        return topItem;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public int size() {
       //System.out.println("Current size :: " + this.capacity);
        return this.capacity;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++)
            stackArray[i] = null;
        capacity = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top - 1; i >= 0; i--) {
            sb.append(this.pop());

            if (i > 0) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}