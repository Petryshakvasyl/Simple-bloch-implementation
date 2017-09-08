package com.pevsat.solid.sr.hometask;

import com.pevsat.solid.sr.hometask.domain.entity.Device;

/**
 * Created by pevsat on 26.08.2017.
 */
public class RemoteControl {

   private Device device;

    public static final RemoteControl INSTANCE = new RemoteControl();


    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    private RemoteControl(){}

    public void chouseDevice(Device device){
        this.device = device;
    }

    public void turnOff(){
        device.dontPlay();
    }

    public void turnOnn(){
        device.play();
    }
}
