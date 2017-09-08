package com.pevsat.oracle_tuorial.generics;

/**
 * Created by pevsat on 08.09.2017.
 * @param <T> the type of the value being boxed
 *
 * The most commonly used type parameter names are:
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 */
public class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
