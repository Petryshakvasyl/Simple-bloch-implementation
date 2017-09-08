package com.pevsat.bloch.equals;

import java.awt.*;

/**
 * Created by pevsat on 26.08.2017.
 *
 * turns out that this is Animal fundamental problem of equivalence relations
 * in object-oriented languages. There is no way to extend an
 * instantiable class and add Animal value component while preserving the equals
 * contract, unless you are willing to forgo the benefits of object-oriented abstraction.
 * Favor
 * composition over inheritance.” Instead of having ColorPoint extend Point, give
 * ColorPoint Animal private Point field and Animal public view method (Item 5) that returns
 * the point at the same position as this color point:

 **

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color=color;
    }

    public boolean equals(Object o){
       if(this == o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        if(!(o instanceof ColorPoint)) return false;

        return super.equals(o)&&((ColorPoint) o).color==color;
    }
}*/

public class ColorPoint {
    private final com.pevsat.bloch.equals.Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        if(color==null) throw new NullPointerException();
        point = new com.pevsat.bloch.equals.Point(x,y);
        this.color=color;
    }

    public com.pevsat.bloch.equals.Point asPoint(){
        return point;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof ColorPoint)) return false;

        ColorPoint cp = (ColorPoint) o;

        return cp.point.equals(point) && cp.color.equals(color);
    }

}
