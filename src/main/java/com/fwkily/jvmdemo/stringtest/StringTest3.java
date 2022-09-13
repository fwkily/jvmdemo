package com.fwkily.jvmdemo.stringtest;


import java.util.HashSet;
import java.util.Set;

/**
 * -XX:MetaspaceSize=0.1k -XX:MaxMetaspaceSize=0.1k -Xms0.1k -Xmx0.1k
 */
public class StringTest3 {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        short i = 0;
        while (true){
            set.add(String.valueOf(i++).intern());
        }



    }



}
