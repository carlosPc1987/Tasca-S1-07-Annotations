package org.example.nivell1.exercici1.application;


import org.example.nivell1.exercici1.module.OnlineWorker;
import org.example.nivell1.exercici1.module.OnsiteWorker;
import org.example.nivell1.exercici1.module.Worker;

public class AppExecutor {
    public void executeProgram() {
        Worker baseWorker = new Worker("Alex", "Smith", 15.0);
        OnlineWorker remoteWorker = new OnlineWorker("Sophie", "Johnson", 18.0);
        OnsiteWorker officeWorker = new OnsiteWorker("James", "Brown", 20.0);

        int hours = 160;

        System.out.println("Base worker salary: " + baseWorker.calculateSalary(hours));
        System.out.println("Online worker salary: " + remoteWorker.calculateSalary(hours));
        System.out.println("Onsite worker salary: " + officeWorker.calculateSalary(hours));
    }
}
