package com.main;

import datastructure.*;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertEnd(4);
        linkedList.insertEnd(7);
        linkedList.insertEnd(2);
        linkedList.removeStart();
        linkedList.removeStart();
        linkedList.removeStart();
        linkedList.print();
    }
}