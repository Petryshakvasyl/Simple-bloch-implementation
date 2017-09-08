package com.pevsat.bloch.equals;

/**
 * Created by pevsat on 26.08.2017.
 */
public class Point {

    private final int x;
    private final int y;


    public Point(int x, int y){
        this.x = x;
        this.y =y;
    }
    /*@Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if (this==obj){
            return true;
        }
        if(!(obj instanceof Point)){
            return false;
        }
        Point p = (Point) obj;
        return p.x==this.x&&p.y==this.y;
    }*/

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
