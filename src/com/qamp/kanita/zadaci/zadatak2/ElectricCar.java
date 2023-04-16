package com.qamp.kanita.zadaci.zadatak2;

public class ElectricCar extends Vehicle {

    private ElectricEngine theEngine;
    public ElectricCar(final String model, final double capacity){
        super(model);
        this.theEngine = new ElectricEngine(capacity);
    }

    @Override
    public void accelerate(final double increaseBy){
        double fuelConsumed = 0.4 * increaseBy;

        if(this.theEngine.getCapacity() >= fuelConsumed){
            super.accelerate(increaseBy);
            this.theEngine.decreaseCapacity(fuelConsumed);
        }
    }

    @Override
    public void decelerate(final double decreaseBy){
        super.decelerate(decreaseBy);
        theEngine.brake(decreaseBy);
    }

    @Override
    public String toString(){
        return super.toString() + "; " + theEngine.toString();
    }


}
