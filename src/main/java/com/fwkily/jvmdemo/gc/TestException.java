package com.fwkily.jvmdemo.gc;

public class TestException {


    public static void main(String[] args) {
        try {
            t1();
        }catch (Exception e){
//            System.out.println("printStackTrace=========================");
//            e.printStackTrace();
//            System.out.println("e.getCause().getMessage()=========================");
//            System.out.println(e.getCause().getMessage());
//            System.out.println("e.getMessage()=========================");
//            System.out.println(e.getMessage());
            System.out.println("e.getCause().toString()=========================");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                System.out.println(" " + stackTrace[i].toString());
            }
        }

    }

    public static void t1(){
        Man man = null;
        System.out.println(man.getId());


    }


}
