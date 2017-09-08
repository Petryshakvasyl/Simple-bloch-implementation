package com.pevsat.solid.liskovsp.badpractice;

/**
 * Created by pevsat on 28.08.2017.
 */
public class EnglishTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("Teach english");
    }
}
