package com.pevsat.dp.dependencyinjection.badpractice.entity.engineImpl;

import com.pevsat.dp.dependencyinjection.badpractice.entity.Engine;

/**
 * Created by pevsat on 29.08.2017.
 */
public class LargeEngine implements Engine {

    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting large engine\n horse power: " + horsePower );
    }
}
