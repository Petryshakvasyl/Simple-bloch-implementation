package com.pevsat.solid.liskovsp.corect;

/**
 * Created by pevsat on 28.08.2017.
 */
public class SchollStaff {

    private void makeAnnouncements(){
        System.out.println("made Announcements");
    }

    private void takeAttendence(){
        System.out.println("took Attendence");
    }

    private void collectPaperWork(){
        System.out.println("collected work");
    }

    private void conductHallWayDuties(){
        System.out.println("conducted hallway");
    }

    public void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallWayDuties();
    }
}
