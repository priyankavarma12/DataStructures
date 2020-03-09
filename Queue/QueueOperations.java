package jedi;

import java.util.Arrays;

public class QueueOperations<E> implements QueueInterface<E> {

    private static Object[]  queueArray;
    private static int front, rear, capacity ;
    private static int currentSize;

    public QueueOperations(int capacity){
        this.currentSize = 0;
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        queueArray = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
       if(currentSize == 0)
           return true;
        return false;
    }

    @Override
    public void enqueue(E item) {
        if (isQueueFull()) {
            System.out.println("Queue is Over Flow, So unable to add the element : " + item);
        } else {
            rear++;
            if (rear == capacity)
                rear = 0;
            queueArray[rear] = item;
            currentSize++;
        }
    }

    public boolean isQueueFull() {
        boolean flag = false;
        if (currentSize == capacity)
            flag = true;
        return flag;
    }

    @Override
    public void dequeue() {
        if(currentSize == 0){
            System.out.println("Queue is Under Flow, So unable to push out the element ");
        } else {
            front++;
            if(front == capacity)
                front = 0;
            currentSize-- ;
        }
    }

    @Override
    public E front() {
        if(front == -1 && rear == -1)
            System.out.println("Queue is Empty");
        E frontItem = (E) queueArray[front];
        return frontItem;
    }

    public int size(){
        return this.currentSize;
    }

    public String toString(){
        return Arrays.toString(this.queueArray);
    }
}
