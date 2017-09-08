package com.pevsat.bloch.item_20;

/**
 * Created by pevsat on 05.09.2017.
 *
 * Such tagged classes have numerous shortcomings.
 * They are cluttered with boilerplate, including enum declarations, tag fields, and switch statements
 * In short, tagged classes are verbose, error-prone, and inefficient.
 *  To transform a tagged class into a class hierarchy, first define an abstract class
 *  containing an abstract method for each method in the tagged class whose behavior
 *  depends on the tag value.
 */
public class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    // Tag field - the shape of this figure
    final Shape shape;

    // this fields are used only if shape is rectangle
    double width;
    double length;

    public Figure(double width, double length){
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    // this field is used only if shape is circle
    double radius;

    public Figure(double radius){
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    double area(){

        switch (shape){
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }
}
