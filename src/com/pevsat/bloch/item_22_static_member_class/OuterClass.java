package com.pevsat.bloch.item_22_static_member_class;

/**
 * Created by pevsat on 06.09.2017.
 */
public class OuterClass {

    private String outerName;

    public String nestedField;

    public OuterClass(String outerName){
        this.outerName = outerName;
    }

    public OuterClass(Nested nested){
        nestedField = nested.JUST_DO_IT;
    }

    public static class Nested{
        public static final String JUST_DO_IT = " Just do it";
    }

    public class Inner{
        public String returnPrivateFild(){
            return outerName;
        }
    }

    public String getOuterName() {
        return outerName;
    }

    public void setOuterName(String outerName) {
        this.outerName = outerName;
    }
}
