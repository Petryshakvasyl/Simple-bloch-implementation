package com.pevsat.bloch.item15_composition.badpractice;

import java.util.Arrays;

/**
 * Created by pevsat on 02.09.2017.
 */
public class App {

    public static void main(String[] args) {
        InstrumentedHashSet<String> set = new InstrumentedHashSet<>();

        set.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        System.out.println(set.getCount());
    }
}
