package com.fwkily.jvmdemo.heap;

public class Test {

    private Integer id;

    private String name;

    private final String age;

    public Test(String age){
        this.age = age;
    }

    public static int a = 1;

    public static int getA(){
        return a;
    }

//    public Test(){
//        System.out.println("构造方法执行。。。");
//    }
//
//    public Test(Integer id) {
//        this.id = id;
//    }
//
//    public Test(String name) {
//        this.name = name;
//    }
//
//    public Test(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
    public void test1(){
        System.out.println(id);
    }


    public static void main(String[] args) {
        Test test = new Test("333");
        System.out.println(test.age);
    }



}
