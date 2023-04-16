package com.qamp.kanita.zadaci.zadatak2;

public class Engine {
    protected double capacity;

    public Engine(final double capacity){
        this.capacity = capacity;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public void increaseCapacity(double increaseBy){
        this.capacity = this.capacity + increaseBy;
    }

    public void decreaseCapacity(double decreaseBy){
        this.capacity = this.capacity - decreaseBy;
    }

    public String toString(){
        return "capacity: " + this.capacity;
    }
}
