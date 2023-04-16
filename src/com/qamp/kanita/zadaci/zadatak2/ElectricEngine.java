package com.qamp.kanita.zadaci.zadatak2;

public class ElectricEngine extends Engine{
    protected ElectricEngine(final double capacity) {
        super(capacity);
    }

    public void brake(final double brakeSpeed){
        this.capacity = 0.1 * brakeSpeed;
    }

}
