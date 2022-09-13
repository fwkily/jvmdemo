package com.fwkily.jvmdemo.gc;

public class CanRelive {

    public static CanRelive obj;

    /**
     * finalize只会被调用一次
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用了finalize方法！");
        obj = this;
    }


    public static void main(String[] args) throws InterruptedException {
        obj = new CanRelive();
        obj = null;
        System.out.println("第一次gc");
        System.gc();
        Thread.sleep(2000000);
        if(obj == null){
            System.out.println("obj已经死了！");
        }else {
            System.out.println("obj还活着！");
        }

        obj = null;
        System.out.println("第二次gc");
        System.gc();
        Thread.sleep(2000);
        if(obj == null){
            System.out.println("obj已经死了！");
        }else {
            System.out.println("obj还活着！");
        }


    }


}
