package com.pevsat.bloch.item15_composition.correct;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pevsat on 02.09.2017.
 *
 * Inheritance is appropriate only in circumstances where the subclass really is a
 * subtype of the superclass. In other words, a class B should extend a class A only if
 * an “is-a” relationship exists between the two classes. If you are tempted to have a
 * class B extend a class A, ask yourself the question: Is every B really an A? If you
 * cannot truthfully answer yes to this question, B should not extend A. If the answer
 * is no, it is often the case that B should contain a private instance of A and expose a
 * smaller and simpler API: A is not an essential part of B, merely a detail of its
 * implementation.
 *
 * There is one last set of questions you should ask yourself before deciding to
 * use inheritance in place of composition. Does the class that you contemplate
 * extending have any flaws in its API? If so, are you comfortable propagating those
 * flaws into your class’s API? Inheritance propagates any flaws in the superclass’s
 * API, while composition lets you design a new API that hides these flaws.
 *
 * To summarize, inheritance is powerful, but it is problematic because it
 * violates encapsulation. It is appropriate only when a genuine subtype relationship
 * exists between the subclass and the superclass. Even then, inheritance may lead to
 * fragility if the subclass is in a different package from the superclass and the
 * superclass is not designed for inheritance. To avoid this fragility, use composition
 * and forwarding instead of inheritance, especially if an appropriate interface to
 * implement a wrapper class exists. Not only are wrapper classes more robust than
 * subclasses, they are also more powerful.
 *
 *     Decorator pattern
 */
public class InstrumentedHashSet<E> extends ForwardingSet<E>{

    private int count =0;

    public InstrumentedHashSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count+=c.size();
        return super.addAll(c);
    }

    /*
    private Set<E> componentSet = new HashSet<>();

    InstrumentedHashSet(){}

    public boolean add(E e) {
        System.out.println("invoke add method");
        count++;
        return componentSet.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        count+=c.size();
        return componentSet.addAll(c);
    }*/

    public int getCount() {
        return count;
    }
}
