package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverseUsingRecursion<E> {

    private static <E> Queue<E> reverseQueue(Queue<E> queue) {
        if(queue.isEmpty()) {
            return queue;
        } else {
            E currentItem = queue.peek();
            queue.remove();
            queue = reverseQueue(queue);
            queue.add(currentItem);
        }
        return queue;
    }

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("p");
        queue.add("r");
        queue.add("i");
        queue.add("y");
        queue.add("a");
        queue.add("n");
        queue.add("k");
        queue.add("a");

        System.out.println("Original Queue :: "+queue);
        reverseQueue(queue);
        System.out.println("Reverse Queue :: "+queue);
    }


}
