package com.fwkily.jvmdemo.parttwo;

/**
 * @Classname SonTest
 * @Description TODO
 * @Date 2022/9/22 4:30 PM
 * @Created by fuwk
 */

public class Test{

    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.x);

    }
}

class Son extends Father {

    int x = 30;


    public Son(){
        this.print();
        this.x = 40;
    }

    public void print() {
        System.out.println(this.x);

    }

}


class Father {
    int x = 10;


    public Father(){
        this.print();
        this.x = 20;
    }

    public void print() {
        System.out.println(this.x);

    }


}
