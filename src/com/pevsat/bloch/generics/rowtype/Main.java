package com.pevsat.bloch.generics.rowtype;

import java.util.*;

/**
 * Created by pevsat on 09.09.2017.
 */
public class Main {

    // Uses raw type (List) - fails at runtime! - don't do this
    public static void unsafeAdd(List list, Object o){
        list.add(o);
    }

    // Use of raw type for unknown element type - don't do this!

    /**
     * This method works but it uses raw types, which are dangerous.
     * @param s1 is not parameterized
     * @param s2 is not parameterized
     * @return the number of elements s1 and s2 have in common.
     */
   private static int numElementsInCommon(Set s1, Set s2) {
       int result = 0;
       for (Object o1 : s1) {
           if (s2.contains(o1))
               result++;
       }
       return result;
    }

    /**
     *Java has provided a safe alternative known as
     * **unbounded wildcard types.**
     * If you want to use a generic type but you don’t know or care what the actual type
     * parameter is, you can use a question mark instead. For example, the unbounded
     * wildcard type for the generic type Set<E> is Set<?> (read “set of some type”). It
     * is the most general parameterized Set type, capable of holding any set. Here is
     * how the numElementsInCommon method looks with unbounded wildcard types:
     */
   private static int numberElementsInCommon(Set<?> s1, Set<?> s2){
       int result = 0;
       for (Object o1 : s1) {
           if (s2.contains(o1))
               result++;
       }
       return result;
   }

    /**
     *
     * You must use raw types in class literals. The specification
     * does not permit the use of parameterized types (though it does permit
     * array types and primitive types) [JLS, 15.8.2]. In other words, List.class,
     * String[].class, and int.class are all legal,
     * but List<String>.class and  List<?>.class are not.
     */

    private static void illegalSelectType(){

        System.out.println(String[].class);
        System.out.println(int.class);
        System.out.println(List.class);

        //You can't do this:

       /* System.out.println(List<?>.class);
        System.out.println(List<String>.class);*/
    }

    /**
     * Because generic type information is erased at runtime, it is illegal to use the instanceof
     * operator on parameterized types other than unbounded wildcard types. The use of
     * unbounded wildcard types in place of raw types does not affect the behavior of the
     * instanceof operator in any way. In this case, the angle brackets and question
     * marks are just noise
     */

    private static boolean checkInstanceOf(Object o){
        // Legitimate use of raw type - instanceof operator
        if(o instanceof Set){
            Set<?> m = (Set<?>) o;
            return true;
        }
        return false;
    }
}

