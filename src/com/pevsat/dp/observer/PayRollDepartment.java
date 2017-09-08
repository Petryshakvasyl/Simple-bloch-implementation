package com.pevsat.dp.observer;

/**
 * Created by pevsat on 30.08.2017.
 */
public class PayRollDepartment implements IObserver {
    @Override
    public void callMe() {
        System.out.println("PayRollDepartment notified ....");
    }
}
