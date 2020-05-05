package com.linkedlist;

public class LinkedListRecursion {

    public static void main(String[] args) {
        Node head = null;
        head = insertAtEnd(head, 6);
        head = insertAtEnd(head, 8);
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 11);
        head = insertAtEnd(head, 12);
        traverse(head);

    }

    static class Node {
        int data;
        Node next;
    };

    static Node newNode(int data){
        Node new_Node = new Node();
        new_Node.data = data;
        new_Node.next = null;
        return new_Node;
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
        System.out.print(head.data+ "->" );
        traverse(head.next);
    }
}
