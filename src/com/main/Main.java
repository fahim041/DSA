package com.main;

import datastructure.DynamicArrays;

public class Main {
    public static void main(String[] args) {
        DynamicArrays dynamicArrays = new DynamicArrays();
        dynamicArrays.push(6);
        dynamicArrays.push(10);
        dynamicArrays.push(11);
        dynamicArrays.insert(2, 22);
        System.out.println(dynamicArrays.get(2));
    }
}