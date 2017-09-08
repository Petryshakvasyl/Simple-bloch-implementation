package com.pevsat.bloch.toString;

/**
 * Created by pevsat on 29.08.2017.
 */
public class App {

    public static void main(String[] args) {
       FormatedToStringPhoneNumber fNumber = new FormatedToStringPhoneNumber(380, 95, 6661840);
        NonFormatedToStringPhoneNumber nfNumber = new NonFormatedToStringPhoneNumber(380, 95, 6661840);
        System.out.println(fNumber);
        System.out.println(nfNumber);

    }
}
