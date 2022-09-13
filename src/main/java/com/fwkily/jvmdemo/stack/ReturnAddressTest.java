package com.fwkily.jvmdemo.stack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReturnAddressTest {


    public native void test();

    public void test1() {
        try {
            test2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void test2() throws FileNotFoundException {
        File file = new File("a.text");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

}
