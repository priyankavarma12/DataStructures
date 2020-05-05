package com.queue;

public interface QueueInterface<E> {

    void enqueue (E item);
    void dequeue();
    E front();
    boolean isEmpty();

}
