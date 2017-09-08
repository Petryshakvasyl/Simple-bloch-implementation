package com.pevsat.solid.dependencyinversion.processes;

/**
 * Created by pevsat on 26.08.2017.
 */
public class LaptopManufactoringProcess extends GeneralManufacturingProcess {


    public LaptopManufactoringProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled laptop");

    }

    @Override
    protected void testDevice() {
        System.out.println("Test laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store laptop");
    }
}
