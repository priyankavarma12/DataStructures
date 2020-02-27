package com.linkedList;

public class LinkedListCircular {

    public static void main(String[] args) {
        LinkedListCircular linkedListCircular = new LinkedListCircular();
        linkedListCircular.push(3);
        linkedListCircular.push(4);
        linkedListCircular.push(5);
        linkedListCircular.push(6);

        linkedListCircular.head.next.next.next.next = linkedListCircular.head;
        linkedListCircular.detectLoop();

    }

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    private void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    int detectLoop(){
        Node slow_p = head, fast_p = head;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p) {
                System.out.println("Found loop");
                return 1;
            }
        }
        return 0;
    }

}
