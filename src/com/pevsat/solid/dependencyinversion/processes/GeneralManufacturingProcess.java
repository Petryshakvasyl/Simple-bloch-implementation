package com.pevsat.solid.dependencyinversion.processes;

/**
 * Created by pevsat on 26.08.2017.
 */
public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String processName){
        this.processName = processName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

//    template method: (DP Template)

    public void lounchProcess(){
        if (processName != null && !processName.isEmpty()){
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }else
            System.out.println("No process was specified");

    }

}
