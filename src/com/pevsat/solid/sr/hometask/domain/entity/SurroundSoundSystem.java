package com.pevsat.solid.sr.hometask.domain.entity;

/**
 * Created by pevsat on 26.08.2017.
 */
public class SurroundSoundSystem implements Device {

    @Override
    public void play() {
        System.out.println("Play SurroundSoundSystem");
    }

    @Override
    public void dontPlay() {
        System.out.println("Off SurroundSoundSystem");
    }
}
