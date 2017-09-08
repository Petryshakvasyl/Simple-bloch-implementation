package com.pevsat.inner_class;

/**
 * Created by pevsat on 07.09.2017.
 */
public class OuterClass {

    static String name;

    public class Inner{
        public static final int age = 5;

    }


    public void someMethod(){

        int value = 10;

        class Local{

            Local(){

                System.out.println(value);
            }
        }

        Local local = new Local();
    }
}
