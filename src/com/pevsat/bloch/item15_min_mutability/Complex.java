package com.pevsat.bloch.item15_min_mutability;

import java.math.BigInteger;

/**
 * Created by pevsat on 31.08.2017.
 * 1. Don’t provide any methods that modify the object’s state (known as mutators).
 * 2. Ensure that the class can’t be extended.
 * This prevents careless or malicious
 * subclasses from compromising the immutable behavior of the class by behaving
 * as if the object’s state has changed.
 * 3. Make all fields final.
 * This clearly expresses your intent in a manner that is enforced
 * by the system. Also, it is necessary to ensure correct behavior if a reference
 * to a newly created instance is passed from one thread to another without
 * synchronization, as spelled out in the memory model [JLS, 17.5; Goetz06 16].
 * 4. Make all fields private.
 * This prevents clients from obtaining access to mutable
 * objects referred to by fields and modifying these objects directly.
 * 5. Ensure exclusive access to any mutable components.
 *
 * Immutable objects are inherently thread-safe; they require no synchronization.
 *
 * An immutable class can provide static factories
 *
 * Immutable objects make great building blocks for other objects,
 *
 * The only real disadvantage of immutable classes is that they require a
 * separate object for each distinct value
 *
 * The alternative to making an immutable class final is to make all of
 * its constructors private or package-private, and to add public static factories in
 * place of the public constructors (Item 1).
 * @See com.pevsat.bloch.item15_min_mutability.private_constructors.Complex
 *
 * There are some classes for which immutability is impractical. If a class cannot
 * be made immutable, limit its mutability as much as possible. Reducing the
 * number of states in which an object can exist makes it easier to reason about the
 * object and reduces the likelihood of errors. Therefore, make every field final
 * unless there is a compelling reason to make it nonfinal.
 *
 *
 **/
public final class Complex {

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

    public Complex(double real, double imagin) {
        this.real = real;
        this.imagin = imagin;
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
