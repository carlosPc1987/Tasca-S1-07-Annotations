package org.example.nivell1.exercici2.module;


public class OnlineWorker extends Worker {

    private static final double INTERNET_FLAT_RATE = 50.0;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * hourlyRate) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void connectViaDialUp() {
        System.out.println("Connecting using deprecated dial-up method...");
    }
}
