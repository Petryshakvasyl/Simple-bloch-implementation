package com.pevsat.bloch.item15_composition.correct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pevsat on 02.09.2017.
 */
public class App {
    public static void main(String[] args) {
        Set<String> set = new InstrumentedHashSet<>(new HashSet<>());
        set.addAll(Arrays.asList("Snap", "Crackle", "Pop", "Henry"));
    }
}
