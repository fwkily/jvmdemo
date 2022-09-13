package com.fwkily.jvmdemo.stack;


@FunctionalInterface
interface Func{
    boolean func(String s);
}

public class Lambada {


    public void lambda(Func c){
        return;
    }

    public static void main(String[] args) {
        Lambada lambada = new Lambada();

        Func func = s -> {
            return true;
        };

        lambada.lambda(func);

    }

}
