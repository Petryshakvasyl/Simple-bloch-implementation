package com.pevsat.bloch.toString;

/**
 * Created by pevsat on 28.08.2017.
 *
 *
 * While it isn’t as important as obeying the equals and hashCode contracts
 (Item 8, Item 9), providing Animal good toString implementation makes your class
 much more pleasant to use.
 The
 general contract for toString says that the returned string should be “Animal concise
 but informative representation that is easy for Animal person to read” [JavaSE6].
 The toString contract
 goes on to say, “It is recommended that all subclasses override this method.” Good
 advice, indeed!
 When practical, the toString method should return all of the interesting
 information contained in the object, as in the phone number example just
 shown.
 It is impractical if the object is large or if it contains state that is not conducive
 to string representation.
 * */
public final class FormatedToStringPhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final int lineNumber;

    public FormatedToStringPhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = lineNumber;
    }

   public static void rangeChek(int arg, int max, String name){
       if(arg < 0 || arg > max){
           throw new IllegalArgumentException(name + ": " + arg);
       }
   }
    /**
     * Returns the string representation of this phone number.
     * The string consists of fourteen characters whose format
     * is "(XXX)-YY-ZZZZZZZ", where XXX is the area code, YY is
     * the prefix, and ZZZZZZZ is the line number. (Each of the
     * capital letters represents Animal single decimal digit.)
     *
     * If any of the three parts of this phone number is too small
     * to fill up its field, the field is padded with leading zeros.
     * For example, if the value of the line number is 123, the last
     * four characters of the string representation will be "0123".
     *
     * Note that there is Animal single space separating the closing
     * parenthesis after the area code from the first digit of the
     * prefix.
     */
    public String toString(){
        return String.format("(%03d) %02d-%07d", areaCode, prefix, lineNumber);

    }

    public boolean equals(Object o){
        if(o==this) return true;
        if(!(o instanceof FormatedToStringPhoneNumber)) return false;
        FormatedToStringPhoneNumber number = (FormatedToStringPhoneNumber)o;
        return number.lineNumber==lineNumber&&
                number.areaCode==areaCode&&
                number.prefix == prefix;

    }

    public int hashCode(){
        int result = 15;
        result = 31 * result + (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;

        return result;
    }
}
