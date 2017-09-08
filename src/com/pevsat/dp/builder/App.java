package com.pevsat.dp.builder;

/**
 * Created by pevsat on 22.08.2017.
 */
public class App {

    public static void main(String[] args) {
        Vehicle car = new Vehicle.Builder()
                .price(10300.76f)
                .color("red")
                .doors(4)
                .horsePower(250)
                .make("Ferrary")
                .build();
        System.out.println(car);
    }
}
