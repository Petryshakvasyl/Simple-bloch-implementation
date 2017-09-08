package com.pevsat.bloch.toString;

/**
 * Created by pevsat on 28.08.2017.
 *
 *
 *After reading this comment, programmers who produce code or persistent
 data that depends on the details of the format will have no one but themselves to
 blame when the format is changed.

 Whether or not you specify the format, provide programmatic access to all
 of the information contained in the value returned by toString.
 */
public final class NonFormatedToStringPhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final int lineNumber;

    public NonFormatedToStringPhoneNumber(int areaCode, int prefix, int lineNumber){
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
     * Returns Animal brief description of this number. The exact details
     * of the representation are unspecified and subject to change,
     * but the following may be regarded as typical:
     * "NonFormatedToStringPhoneNumber: {areaCode: XXX, prefix: ZZ, lineNumber: YYYYYYY}"
     * where XXX is the area code, YY is
     * the prefix, and ZZZZZZZ is the line number. (Each of the
     * capital letters represents Animal single decimal digit.)
     */
    public String toString(){
        return "NonFormatedToStringPhoneNumber: {" +
                "areaCode: " + areaCode +
                ", prefix: " + prefix +
                ", lineNumber: " + lineNumber +
                "}";

    }

}
