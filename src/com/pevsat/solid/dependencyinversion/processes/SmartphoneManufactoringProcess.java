package com.pevsat.solid.dependencyinversion.processes;

/**
 * Created by pevsat on 26.08.2017.
 */
public class SmartphoneManufactoringProcess extends GeneralManufacturingProcess {

    public SmartphoneManufactoringProcess (String name){
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assemble smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("test smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store smartphone");
    }


}
