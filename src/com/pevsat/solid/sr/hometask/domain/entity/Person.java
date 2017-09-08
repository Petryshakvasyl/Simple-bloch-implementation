package com.pevsat.solid.sr.hometask.domain.entity;

import com.pevsat.solid.sr.hometask.RemoteControl;

/**
 * Created by pevsat on 26.08.2017.
 */
public class Person {

    public static void main(String[] args) {
        TV tv = new TV();
        Projector projector = new Projector();
        RemoteControl control = RemoteControl.getInstance();
        control.chouseDevice(tv);
        control.turnOnn();

        control.chouseDevice(projector);

        control.turnOnn();

    }
}
