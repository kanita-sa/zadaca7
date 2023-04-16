package com.qamp.kanita.zadaci.zadatak1;

public class Main {
    public static void main(String[] args) {
        final Person person1 = new Person("Kanita");
        System.out.println(person1.toString());

        final Employee employee1 = new Employee("John Doe", 50000, "NBC1987");
        System.out.println(employee1.toString());
    }
}
