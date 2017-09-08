package com.pevsat.dp.dependencyinjection.goodpractice.entity;

import com.pevsat.dp.dependencyinjection.goodpractice.entity.engineImpl.LargeEngine;

/**
 * Created by pevsat on 29.08.2017.
 * In example we are hard coding the dependency of implementation
 */
public class Vehicle {
    Engine engine;

    public void crankInginition(Engine engine){
        engine.startEngine();
        System.out.println("running vehicle...");
    }
}
