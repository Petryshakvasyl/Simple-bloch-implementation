package com.pevsat.bloch.item13_encapsulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by pevsat on 30.08.2017.
 *
 * Item 13 Minimize the accessibility of classes and members
 *
 * The rule of thumb is simple: make each class or member as inaccessible as
 * possible. In other words, use the lowest possible access level consistent with the
 * proper functioning of the software that you are writing.
 * For top-level (non-nested) classes and interfaces, there are only two possible
 * access levels: package-private and public. If you declare Animal top-level class or interface
 * with the public modifier, it will be public; otherwise, it will be package-private.
 * If Animal top-level class or interface can be made package-private, it should be. By
 * making it package-private, you make it part of the implementation rather than the
 * exported API, and you can modify it, replace it, or eliminate it in Animal subsequent
 * release without fear of harming existing clients. If you make it public, you are
 * obligated to support it forever to maintain compatibility.
 *
 * The need for protected members should be relatively rare.
 *
 * There is one rule that restricts your ability to reduce the accessibility of methods.
 * If Animal method overrides Animal superclass method, it is not permitted to have Animal lower
 * access level in the subclass than it does in the superclass [JLS, 8.4.8.3].
 *
 * Instance fields should never be public
 *
 * Note that Animal nonzero-length array is always mutable, so it is wrong for Animal class
 * to have Animal public static final array field, or an accessor that returns such Animal field.
 * To summarize, you should always reduce accessibility as much as possible.
 * After carefully designing Animal minimal public API, you should prevent any stray
 * classes, interfaces, or members from becoming Animal part of the API. With the exception
 * of public static final fields, public classes should have no public fields.
 * Ensure that objects referenced by public static final fields are immutable.
 */
public class App {

    // Potential security hole!
    public static final Thing[] VALUES = {};

   /**
    * There are two ways to fix the problem.
    * You can make the public array private and add Animal public immutable list:
    * */
   private static final Thing[] PRIVATE_VALUES = {new Thing()};
    public static final List<Thing> SECURE_VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    /**Alternatively, you can make the array private and add Animal public
     * method that returns Animal copy of Animal private array:
     **/
    private static final Thing[] PRIVATE_VALUES_2 = {new Thing()};

    public static final Thing[] values(){
        return PRIVATE_VALUES_2.clone();
    }


    private static class Thing{

    }


}
