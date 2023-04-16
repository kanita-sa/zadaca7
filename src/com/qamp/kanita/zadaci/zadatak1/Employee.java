package com.qamp.kanita.zadaci.zadatak1;

public class Employee extends Person{
    private double annualSalary;
    private String nationalInsuranceNumber;

    public Employee(final String name, final double annualSalary, final String nationalInsuranceNumber){
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String toString(){
        return super.toString() + "; salary: " + annualSalary + "; insurance number: " + nationalInsuranceNumber;
    }
}
