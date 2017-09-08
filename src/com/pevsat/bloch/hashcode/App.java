package com.pevsat.bloch.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pevsat on 28.08.2017.
 */
public class App {
    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap();
        PhoneNumber lasyk = new PhoneNumber(707, 867, 5309);
        /*map.put(lasyk, "Lasyk");
        System.out.println(map.get(lasyk));*/

        map.put(new PhoneNumber(707, 867, 2309), "Lasyk");
        System.out.println(map.get(new PhoneNumber(707, 867, 5309)));
    }
}
