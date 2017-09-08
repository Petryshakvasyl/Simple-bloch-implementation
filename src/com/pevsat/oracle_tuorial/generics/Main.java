package com.pevsat.oracle_tuorial.generics;

/**
 * Created by pevsat on 08.09.2017.
 */
public class Main {
    /**
     * To completely disable unchecked warnings, use the -Xlint:-unchecked flag. The
     * @SuppressWarnings("unchecked") annotation suppresses unchecked warnings.
     * @param args
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //if you assign a raw type to a parameterized type, you get a warning:
        Box littleBox = new Box();
        Box<Integer> integerBox = littleBox;

        Box<String> stringBox = new Box<>();

        Box rawBox = stringBox;
        rawBox.set(8);  // warning: unchecked invocation to set(T)

        OrderedPair<String, Integer> pair = new OrderedPair<>("Jim", 25);
        OrderedPair<String, Integer> pair2 = new OrderedPair<>("Julia", 21);

        System.out.println(pair.getKey() + " \nage: " + pair.getValue());
    }
}
