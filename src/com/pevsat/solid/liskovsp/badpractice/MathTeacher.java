package com.pevsat.solid.liskovsp.badpractice;

/**
 * Created by pevsat on 28.08.2017.
 */
public class MathTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("teach math");
    }
}
