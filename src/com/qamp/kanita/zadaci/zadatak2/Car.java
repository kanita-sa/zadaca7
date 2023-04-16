package com.qamp.kanita.zadaci.zadatak2;

public class Car extends Vehicle{

    private DieselEngine theEngine;
    public Car(final String model, final double capacity){
        super(model);
        this.theEngine = new DieselEngine(capacity);
    }

    @Override
    public void accelerate(final double increaseBy){
        double fuelConsumed = 0.2 * increaseBy;

        if(this.theEngine.getCapacity() >= fuelConsumed){
            super.accelerate(increaseBy);
            this.theEngine.decreaseCapacity(fuelConsumed);
        }
    }

    @Override
    public void decelerate(final double decreaseBy){
        super.decelerate(decreaseBy);
    }

    @Override
    public String toString(){
        return super.toString() + "; " + theEngine.toString();
    }

}
