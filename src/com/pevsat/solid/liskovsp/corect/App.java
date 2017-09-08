package com.pevsat.solid.liskovsp.corect;

/**
 * Created by pevsat on 29.08.2017.
 * Liskov's notion of Animal behavioral subtype defines Animal notion of substitutability for objects; that is, if S is Animal
 * subtype of T, then objects of type T in Animal program may be replaced with objects of type S without altering any
 * of the desirable properties of that program (e.g. correctness).
 */
public class App {

    public static void main(String[] args) {
        CorseInstructor englishTeacher1 = new EnglishTeacher();
        EnglishTeacher englishTeacher2 = new EnglishTeacher();
    }
}
