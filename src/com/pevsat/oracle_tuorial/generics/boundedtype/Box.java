package com.pevsat.oracle_tuorial.generics.boundedtype;

import java.io.Serializable;

/**
 * Created by pevsat on 11.09.2017.
 */
public class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    /**
     * A type parameter can have multiple bounds: <T extends B1 & B2 & B3>
     * A type variable with multiple bounds is a subtype of all the types listed in the bound.
     * If one of the bounds is a class, it must be specified first
     * @param u could be any type that extends Number and implement bot
     * @see Comparable and
     * @see Serializable
     *
     */
    private  <U extends Comparable> void inspect(U u){
        System.out.println("T " + t.getClass().getName());
        System.out.println("U " + u.getClass().getName());
    }

    /**
     * By modifying our generic method to include this bounded type parameter,
     * compilation will now fail, since our invocation of inspect still includes a String:
     *
     */

    private static class MockNumber extends Number{
        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        // integerBox.inspect("Hello string");

        /**
         * because our MockNumber don't implement
         * @see Comparable you you get a compile-time error
         */
       // integerBox.inspect(new MockNumber());
    }

    /**
     * The implementation of the method is straightforward, but it does not compile
     * because the greater than operator (>) applies only to primitive types such
     * as short, int, double, long, float, byte, and char. You cannot use the > operator to compare objects.
     */

    /*private static  <T> int countGreaterThan( T[] array, T elem){
        int count = 0;
        for (T e: array) {
            if(elem > e)
                ++count;
        }
        return count;
    }*/

    /**
     * To fix the problem use a type parameter bounded by the Comparable<T> interface
     */
    private static  <T extends Comparable<T>> int countGreaterThan( T[] array, T elem) {
        int count = 0;
        for (T e : array) {
            if (e.compareTo(elem) > 0)
                ++count;
        }
        return count;
    }
}
