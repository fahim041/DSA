package com.main;

import datastructure.*;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addAtTail(5);
        doublyLinkedList.addAtTail(3);
        doublyLinkedList.addAtIndex(1, 99);
        doublyLinkedList.addAtIndex(3, 55);
        doublyLinkedList.deleteAtIndex(1);
        doublyLinkedList.print();
    }
}