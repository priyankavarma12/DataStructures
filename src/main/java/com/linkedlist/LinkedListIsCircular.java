package com.linkedlist;

public class LinkedListIsCircular {

    public static void main(String[] args) {
        LinkedListIsCircular linkedListIsCircular = new LinkedListIsCircular();
      /*  Node head = newNode(3);
        head.next = newNode(4);
        head.next.next = newNode(6);
        head.next.next.next = newNode(7);*/
        Node head = null;
        head = insertAtEnd(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 6);
        head = insertAtEnd(head, 7);
        traverse(head);
        System.out.println(isListCircular(head)?"Yes\n":"No\n");
        //Making the list as circular
        head.next.next.next.next = head;
        System.out.println("Is loop detected ??");
        System.out.println(" "+linkedListIsCircular.detectLoop());
        System.out.println(isListCircular(head)?"Yes\n":"No\n");
    }

    //head of list
    Node head;
    //Linked List Node
    static class Node{
        int data;
        Node next;
    }

    //Utility function to create new node
    static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    //Boolean function to check the list is circular or not
    static boolean isListCircular(Node head){
        if(head == null)
            return true;
        Node node = head.next;
        while(node != null && node != head)
            node = node.next;
        return (node == head);
    }

    static Node insertAtEnd(Node head, int data){
        if(head == null)
            return newNode(data);
        else
            head.next = insertAtEnd(head.next, data);
        return head;
    }

    static void traverse(Node head){
        if(head == null)
            return;
        System.out.print(head.data+ "->");
        traverse(head.next);
    }



     int detectLoop(){
        Node slow_p = head;
        Node fast_p = head;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p) {
                System.out.println("Found a loop ");
                return 1;
            }
        }
        return 0;
    }
}
