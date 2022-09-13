package com.fwkily.jvmdemo.heap;

public class SimpleHeap {


    private String id;

    public void test1(){
        System.out.println(id);
    }

    public static void main(String[] args) {
        SimpleHeap simpleHeap1 = new SimpleHeap();
        SimpleHeap simpleHeap2 = new SimpleHeap();
        System.out.println(simpleHeap1.id);
        simpleHeap2.test1();
    }

}
