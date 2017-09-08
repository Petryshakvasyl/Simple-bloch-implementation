package com.pevsat.dp.dependencyinjection.badpractice;

import com.pevsat.dp.dependencyinjection.badpractice.entity.Vehicle;

/**
 * Created by pevsat on 29.08.2017.
 *
 */
public class App {

    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle();
        raceCar.crankInginition();
    }
}
