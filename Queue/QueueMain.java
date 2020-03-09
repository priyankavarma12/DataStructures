package jedi;

public class QueueMain {

    public static void main(String[] args) {

        QueueOperations<Integer> obj = new QueueOperations<>(5);

        obj.enqueue(6);
        obj.enqueue(9);
        obj.enqueue(12);
        obj.enqueue(15);

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();

        obj.enqueue(3);
        obj.enqueue(6);
        obj.enqueue(9);
        obj.enqueue(12);
        obj.enqueue(15);

        obj.dequeue();
        obj.dequeue();

        obj.enqueue(15);
        obj.enqueue(3);
        obj.enqueue(18);
        obj.enqueue(21);

        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();

        obj.dequeue();

        System.out.println("Queue before deQ :: "+obj);
        obj.dequeue();
        System.out.println("Queue after deQ :: "+obj);
        obj.enqueue(6);
        System.out.println("Final Queue :: "+obj);

    }

}
