package com.linkedlist;

public class DoublyLinkedListMain {

    public static void main(String[] args) {

       DoublyLinkedListUtil dll = new com.linkedlist.DoublyLinkedListUtil();

        dll.addAtTail(6);
        dll.addAtHead(7);
        dll.addAtHead(1);
        dll.addAtTail(4);
        dll.addAtIndex(3, 8);

        System.out.println("Created DLL : ");
        dll.printList(dll.head);

        System.out.println(" ");

        dll.deleteAtIndex(4);
        System.out.println("Deleted Index :");
        dll.printList(dll.head);


        System.out.println("Original List ::  ");
        dll.printList(dll.head);

        System.out.println(" ");

        dll.reverse();
        System.out.println("Reverse List :: ");
        dll.printList(dll.head);

    }
}
