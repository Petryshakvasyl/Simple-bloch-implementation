package com.pevsat.solid.liskovsp.corect;

/**
 * Created by pevsat on 28.08.2017.
 */
public class MathTeacher extends SchollStaff implements CorseInstructor {
    @Override
    public void teach() {
        System.out.println("teach math");
    }
}
