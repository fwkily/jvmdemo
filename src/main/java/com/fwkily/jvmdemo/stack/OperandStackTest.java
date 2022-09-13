package com.fwkily.jvmdemo.stack;

public class OperandStackTest {

    public void testAdd() {
        //byte、short、char、boolean：都以int类型来保存
        byte i = 10;
        int j = 20;
        int k = i + j;

//        long m = 800;
    }

    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        int i = getSum();
        int j = 30;

    }

}
