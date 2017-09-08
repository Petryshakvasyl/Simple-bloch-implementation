package com.pevsat.dp.builder;

/**
 * Created by pevsat on 22.08.2017.
 *
 *
 */

public class Vehicle {

    private String model;

    private String make;

    private String type;

    private float price;

    private int horsePower;

    private String color;

    private int doors;

    private Vehicle(Builder bilder){
        this.color = bilder.color;
        this.doors = bilder.doors;
        this.horsePower = bilder.horsePower;
        this.make = bilder.make;
        this.model = bilder.model;
        this.type = bilder.type;
        this.price = bilder.price;
    }

    public static class Builder{

        private String model;
        private String make;
        private String type;
        private float price;
        private int horsePower;
        private String color;
        private int doors;

        public Builder model(String value){
            this.model = value;
            return this;
        }

        public Builder make(String value){
            this.make = value;
            return this;
        }

        public Builder price(float value){
            this.price = value;
            return this;
        }

        public Builder type(String value){
            this.type = value;
            return this;
        }

        public Builder horsePower(int value){
            this.horsePower = value;
            return this;
        }

        public Builder color(String value){
            this.color = value;
            return this;
        }

        public Builder doors(int value){
            this.doors = value;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }

    @Override
    public String toString() {
        return "com.pevsat.dp.builder.Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
