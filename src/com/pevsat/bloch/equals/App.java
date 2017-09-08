package com.pevsat.bloch.equals;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pevsat on 26.08.2017.
 */
public class App {
    public static void main(String[] args) {
        com.pevsat.bloch.equals.Point p1 = new com.pevsat.bloch.equals.Point(5,1);

//        Point p2 = new Point(5,1);
//        Point p2= new ColorPoint(5,1, Color.RED);
        ColorPoint p3= new ColorPoint(5,1, Color.RED);

        System.out.println(p3.equals(null));
        System.out.println(p1.equals(p3));
        System.out.println("my" == null);

        Map m = new HashMap<>();

    }
}
