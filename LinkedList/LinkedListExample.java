package com.linkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.append(6);
        linkedListExample.push(5);
        linkedListExample.push(9);
        linkedListExample.append(3);
        linkedListExample.insertAfter(linkedListExample.head.next, 8);
        linkedListExample.printList();

    }

    Node head; // head of list
    //creating new node by constructor
    class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }

    //to print the list
    private void printList(){
        Node tNode = head;
        while (tNode != null){ //traverse the node
            System.out.print(tNode.data+" -> "); //print the data of node
            tNode = tNode.next; // switch from one node to other node
        }
    }

    //add the node at front of the list
    private void push(int data){
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }

    private void insertAfter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    private void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next !=null){
            last = last.next;
        }

        last.next = newNode;
        return;
    }


}
