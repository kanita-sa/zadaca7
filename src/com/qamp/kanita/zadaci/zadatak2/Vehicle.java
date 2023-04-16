package com.qamp.kanita.zadaci.zadatak2;

public class Vehicle {
    private double speed;
    private String model;

    public Vehicle(final String model){
        this.speed = 0.0;
        this.model = model;
    }

    public void accelerate(double accelerateBy){
        this.speed = this.speed + accelerateBy;
    }

    public void decelerate(double decelerateBy){
        if(decelerateBy <= speed){
            this.speed = this.speed - decelerateBy;
        }
        else {
            this.speed = 0.0;
        }
    }

    public String toString(){
        return "Vehicle: " + this.model + "; speed: " + this.speed;
    }
}
