package com.main;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(-4);
        heap.add(-6);
        heap.add(-11);
        heap.add(-9);
        System.out.println(heap);
    }
}