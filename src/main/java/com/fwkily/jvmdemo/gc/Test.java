package com.fwkily.jvmdemo.gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Test {


    public static void main(String[] args) {

        List<Man> list = new ArrayList<>();
        Man zhangsan = Man.getMan("1", "zhangsan");
        Man zhangsan2 = Man.getMan("2", "zhangsan");
        Man zhangsan3 = Man.getMan("3", "zhangsan");
        list.add(zhangsan);
        list.add(zhangsan2);
        list.add(zhangsan3);
        Map<String, String> collect = list.stream().collect(Collectors.toMap(Man::getId, Man::getName));
        if(collect.containsKey("1")){

        }
        collect.forEach((k,v) -> System.out.println(k + ": " + v));

    }

}
