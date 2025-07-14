package org.example.nivell1.exercici2.module;

public class Worker {
    protected String firstName;
    protected String lastName;
    protected double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }
}
