package com.pevsat.solid.dependencyinversion.clients;

import com.pevsat.solid.dependencyinversion.processes.GeneralManufacturingProcess;
import com.pevsat.solid.dependencyinversion.processes.LaptopManufactoringProcess;
import com.pevsat.solid.dependencyinversion.processes.SmartphoneManufactoringProcess;

/**
 * Created by pevsat on 26.08.2017.
 * A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * B. Abstractions should not depend on details. Details should depend on abstractions.
 */
public class DeviceFactory{
    public static void main(String[] args) {
        GeneralManufacturingProcess manufactorPhone = new SmartphoneManufactoringProcess("Apple go on");
        GeneralManufacturingProcess manufactorLaptop = new LaptopManufactoringProcess("Create new super laptop");
        manufactorPhone.lounchProcess();
        System.out.println();
        manufactorLaptop.lounchProcess();
    }
}
