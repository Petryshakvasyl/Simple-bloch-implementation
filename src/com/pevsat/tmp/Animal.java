package com.pevsat.tmp;

/**
 * Created by pevsat on 05.09.2017.
 */
public abstract class Animal {

    public String name;
    private int age;

    public abstract void voice();

    public void doSomething(){
        System.out.println(endEdge());
    }

    private int endEdge(){
        return 100-age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
