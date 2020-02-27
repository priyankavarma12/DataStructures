package com.linkedList;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        MergeSortedLinkedList mergeSortedLinkedList1 = new MergeSortedLinkedList();
        MergeSortedLinkedList mergeSortedLinkedList2 = new MergeSortedLinkedList();
        //first list
        mergeSortedLinkedList1.addToLast(new Node(5));
        mergeSortedLinkedList1.addToLast(new Node(10));
        mergeSortedLinkedList1.addToLast(new Node(15));
        System.out.println("List 1 :: ");
        mergeSortedLinkedList1.printList();
        //second list
        mergeSortedLinkedList2.addToLast(new Node(2));
        mergeSortedLinkedList2.addToLast(new Node(3));
        mergeSortedLinkedList2.addToLast(new Node(20));
        System.out.println("List 2 :: ");
        mergeSortedLinkedList2.printList();

        mergeSortedLinkedList1.head = mergeSortedLinkedList1.sortedMerge(mergeSortedLinkedList1.head, mergeSortedLinkedList2.head);
        System.out.println("Sorted list :: ");
        mergeSortedLinkedList1.printList();


    }

    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    private void addToLast(Node node){
        if(head == null){
            head = node;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            } temp.next = node;
        }
    }

    private void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    private Node sortedMerge(Node p, Node q) {
        if (p == null)
            return q;
        if (q == null)
            return p;
        if (p.data < q.data) {
            p.next = sortedMerge(p.next, q);
            return p;
        } else{
            q.next = sortedMerge(p, q.next);
            return q;
        }
    }

}
