package com.pevsat.solid.sr.hometask.domain.entity;

/**
 * Created by pevsat on 26.08.2017.
 */
public class TV implements Device {

    @Override
    public void play() {
        System.out.println("play Tv");
    }

    @Override
    public void dontPlay() {
        System.out.println("off TV");
    }
}
