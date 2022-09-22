package com.fwkily.jvmdemo.gc;

import java.util.ArrayList;

/**
 * @Classname TestGc
 * @Description TODO
 * @Date 2022/9/22 2:14 PM
 * @Created by fuwk
 *
 * -xms60m -xmx60m -XX:SurvivorRatio=8 -XX:PrintGCDetails -Xloggc:./log/gc.log
 */
public class TestGc {

    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            byte[] b = new byte[1024 * 100];//100kb
            list.add(b);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
