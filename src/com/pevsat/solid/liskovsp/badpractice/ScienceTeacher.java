package com.pevsat.solid.liskovsp.badpractice;

/**
 * Created by pevsat on 28.08.2017.
 */
public class ScienceTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("teach science");
    }
}
