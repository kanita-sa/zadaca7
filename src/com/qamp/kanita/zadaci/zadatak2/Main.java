package com.qamp.kanita.zadaci.zadatak2;

public class Main {

    public static void main(String[] args){

        final Car car1 = new Car("Cadilac", 65);
        System.out.println(car1.toString());

        car1.accelerate(50);
        System.out.println(car1.toString());
        car1.decelerate(20);
        System.out.println(car1.toString());


        final ElectricCar electricCar1 = new ElectricCar("Tesla", 95);
        System.out.println(electricCar1.toString());

        electricCar1.accelerate(80);
        System.out.println(electricCar1.toString());
        electricCar1.decelerate(50);
        System.out.println(electricCar1.toString());


    }
}
