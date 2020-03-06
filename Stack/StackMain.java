package jedi;

public class StackMain {

    public static void main(String[] args) {

        StackOperations<Integer> obj = new StackOperations<>(6);
        obj.push(20);
        obj.push(14);
        obj.push(12);
        obj.push(15);
        obj.pop();
        obj.push(10);
       // System.out.println("is empty :: "+obj.isEmpty());
        System.out.println("Top most item :: "+obj.peek());
        System.out.println("Size of stack :: "+obj.size());
        System.out.println("Stack of Integer :: "+obj);
        obj.clear();
        System.out.println("Size of stack :: "+obj.size());
    }
}
