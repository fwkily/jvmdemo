package com.fwkily.jvmdemo.stack;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("***获取启动类加载器****");
        URL[] path = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : path) {
            System.out.println(url.toExternalForm());
        }

        //从上面随便选择一个类，看他的类加载器是什么：是引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);//null

        System.out.println("***获取扩展类加载器****");
        String dirs = System.getProperty("java.ext.dirs");
        for (String dir : dirs.split(";")){
            System.out.println(dir);
        }

        System.out.println("***获取引导类加载器****");
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@31befd9f


    }


}
