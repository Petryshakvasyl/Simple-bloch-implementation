package com.pevsat.bloch.item15_composition.badpractice;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by pevsat on 02.09.2017.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int count =0;

    InstrumentedHashSet(){}

    InstrumentedHashSet(int initCap, float loadFactor){
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        System.out.println("invoke add method");
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count+=c.size();
        return super.addAll(c);
    }

    public int getCount() {
        return count;
    }
}
