package com.pevsat.tmp;

import com.pevsat.bloch.inner_class.DataStructure;
import com.pevsat.bloch.item_22_static_member_class.OuterClass;

/**
 * Created by pevsat on 05.09.2017.
 */
public class App {
    public static void main(String[] args) {
     /*   System.out.println(OuterClass.Nested.JUST_DO_IT);
        OuterClass outerClass = new OuterClass("SOme class");

        OuterClass.Nested nested = new OuterClass.Nested();
        OuterClass.Inner inner = outerClass.new Inner();


        System.out.println(OuterClass.Nested.JUST_DO_IT);
        System.out.println(inner.getClass());*/

        DataStructure structure = new DataStructure();
        structure.printEven();

    }
}
