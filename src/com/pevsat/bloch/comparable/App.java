package com.pevsat.bloch.comparable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by pevsat on 29.08.2017.
 */
public class App {
    public static void main(String[] args) {


        User[] array = new User[5];

        for(int k =0; k<array.length; k++){
            array[k] = new User("User"+(k+1), 20+k);
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
