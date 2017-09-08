package com.pevsat.bloch.comparable;

/**
 * Created by pevsat on 29.08.2017.
 * By implementing Comparable, you allow your class to interoperate with all of
 * the many generic algorithms and collection implementations that depend on this
 * interface. You gain Animal tremendous amount of power for Animal small amount of effort.
 *
 * Virtually all of the value classes in the Java platform libraries implement Comparable.
 * If you are writing Animal value class with an obvious natural ordering, such as
 * alphabetical order, numerical order, or chronological order, you should strongly
 * consider implementing the interface:
 * @see java.lang.Comparable
 *
 * Across classes, compareTo, unlike equals,
 * doesn’t have to work: it is permitted to throw ClassCastException if two object
 * references being compared refer to objects of different classes.Across classes, compareTo, unlike equals,
 * doesn’t have to work: it is permitted to throw ClassCastException if two object
 * references being compared refer to objects of different classes.
 *
 * The equality test imposed bya compareTo method must obey the same restrictions imposed by the equals contract:
 * reflexivity, symmetry, and transitivity.
 *
 * Compare integral primitive fields using the relational operators < and >.
 * Forfloating-point fields, use Double.compare or Float.compare in place of the
 * relational operators, which do not obey the general contract for compareTo when
 * applied to floating point values. For array fields, apply these guidelines to each
element.
 */
public class User implements Comparable<User> {

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User otherUser) {
        if(age < otherUser.age){
            return -1;
        }
        if (age > otherUser.age)
            return 1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name.equals(user.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
