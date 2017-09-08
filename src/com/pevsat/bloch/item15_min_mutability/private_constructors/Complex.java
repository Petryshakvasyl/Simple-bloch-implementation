package com.pevsat.bloch.item15_min_mutability.private_constructors;

/**
 * The alternative to making an immutable class final is to make all of
 * its constructors private or package-private, and to add public static factories in
 * place of the public constructors (Item 1).
 */
public class Complex {

    /**
     * Immutable classes should take advantage of this by encouraging clients to
     * reuse existing instances wherever possible. One easy way to do this is to provide public
     * static final constants for frequently used values. For example,
     * the Complex class might provide these constants:
     * */
    public static final Complex ZERO = new Complex(0,0);
    public static final Complex ONE = new Complex(1,0);
    public static final Complex I = new Complex(0,1);


    private final double real;
    private final double imagin;

    private Complex(double real, double imagin) {
        this.real = real;
        this.imagin = imagin;
    }

    public static Complex vaoueOf(double real, double imagin){
        return new Complex(real, imagin);
    }

    // Accessors with no corresponding mutators
    public double realPart() { return real; }
    public double imaginaryPart() { return imagin; }

    public Complex add(Complex c){
        return new Complex(real + c.real, imagin + c.imagin);
    }

    public Complex subtract(Complex c){
        return new Complex(real - c.real, imagin - c.imagin);
    }

    public Complex multiply(Complex c) {
        return new Complex(real * c.real - imagin * c.imagin,
                real * c.imagin + imagin * c.real);
    }
    public Complex divide(Complex c) {
        double tmp = c.real * c.real + c.imagin * c.imagin;
        return new Complex((real * c.real + imagin *  c.imagin) / tmp,
                (imagin * c.real - real * c.imagin) / tmp);
    }
    @Override
    public boolean equals(Object o){
        if(o==this) return true;
        if(!(o instanceof Complex)) return false;

        Complex c = (Complex) o;

        return Double.compare(real, c.real)==0 && Double.compare(imagin, c.imagin)==0;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + hashDouble(real);
        result = 31 * result + hashDouble(imagin);
        return result;
    }

    private int hashDouble(double d){
        long longBits = Double.doubleToLongBits(d);
        return (int) (longBits ^ (longBits>>>32));
    }

    @Override public String toString() {
        return "(" + real + " + " + imagin + "i)";
    }
}
