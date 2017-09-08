package com.pevsat.dp.dependencyinjection.badpractice.entity;

import com.pevsat.dp.dependencyinjection.badpractice.entity.engineImpl.LargeEngine;

/**
 * Created by pevsat on 29.08.2017.
 * In example we are hard coding the dependency of implementation
 */
public class Vehicle {
    Engine racingEngine = new LargeEngine(150);

    public void crankInginition(){
        racingEngine.startEngine();
        System.out.println("running vehicle...");
    }
}
