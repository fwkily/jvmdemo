package com.fwkily.jvmdemo.gc;

public class Man{

    public String id;

    public String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Man getMan(String id ,String name){
        Man man = new Man();
        man.setId(id);
        man.setName(name);
        return man;
    }

}
