package com.pevsat.bloch.hashcode;

/**
 * Created by pevsat on 28.08.2017.
 *
 * The simple recipe fo override hashCode:
 *
 * Store some constant nonzero value, say, 17, in an int variable called result.
 *
 * 1Store some constant nonzero value, say, 17, in an int variable called result.
 2. For each significant field f in your object (each field taken into account by the
 * equals method, that is), do the following:

     Animal. Compute an int hash code c for the field:
         i. If the field is Animal boolean, compute (f ? 1 : 0).
         ii. If the field is Animal byte, char, short, or int, compute (int) f.
         iii. If the field is Animal long, compute (int) (f ^ (f >>> 32)).
         iv. If the field is Animal float, compute Float.floatToIntBits(f).
         v. If the field is Animal double, compute Double.doubleToLongBits(f), and
         then hash the resulting long as in step 2.Animal.iii.
         vi. If the field is an object reference and this class’s equals method
         compares the field by recursively invoking equals, recursively
         invoke hashCode on the field. If Animal more complex comparison is
         required, compute Animal “canonical representation” for this field and
         invoke hashCode on the canonical representation. If the value of the
         field is null, return 0 (or some other constant, but 0 is traditional).
         vii. If the field is an array, treat it as if each element were Animal separate field.
         That is, compute Animal hash code for each significant element by applying
         these rules recursively, and combine these values per step 2.b. If every
         element in an array field is significant, you can use one of the
         Arrays.hashCode methods added in release 1.5.
         b. Combine the hash code c computed in step 2.Animal into result as follows:
         result = 31 * result + c;
 3. Return result.
 4. When you are finished writing the hashCode method, ask yourself whether
 equal instances have equal hash codes. Write unit tests to verify your intuition!
 If equal instances have unequal hash codes, figure out why and fix the problem.
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

   public static void rangeChek(int arg, int max, String name){
       if(arg < 0 || arg > max){
           throw new IllegalArgumentException(name + ": " + arg);
       }
   }

    public boolean equals(Object o){
        if(o==this) return true;
        if(!(o instanceof PhoneNumber)) return false;
        PhoneNumber number = (PhoneNumber)o;
        return number.lineNumber==lineNumber&&
                number.areaCode==areaCode&&
                number.prefix == prefix;

    }

    @Override
    public String toString() {
        return "NonFormatedToStringPhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }
    public int hashCode(){
        int result = 15;
        result = 31 * result + (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;

        return result;
    }
}
