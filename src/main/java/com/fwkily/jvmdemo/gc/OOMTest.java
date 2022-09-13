package com.fwkily.jvmdemo.gc;

import java.util.HashSet;

/**
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 */
public class OOMTest {

    static HashSet<Byte[]> set = new HashSet<>();


    public static void main(String[] args) {
        int i = 0;
        while (true){
            Byte[] c = new Byte[1024 * 1024 ];
            set.add(c);
            i++;
            System.out.println("次数：" + i);
        }

    }

}
