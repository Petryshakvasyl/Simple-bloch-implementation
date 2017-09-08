package com.pevsat.dp.dependencyinjection.goodpractice.entity.engineImpl;

import com.pevsat.dp.dependencyinjection.goodpractice.entity.Engine;

/**
 * Created by pevsat on 29.08.2017.
 */
public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting small engine, horse power: " + horsePower );
    }
}
