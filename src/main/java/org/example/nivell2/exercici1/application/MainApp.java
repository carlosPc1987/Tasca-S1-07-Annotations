package org.example.nivell2.exercici1.application;


import org.example.nivell2.exercici1.module.JsonSerializer;
import org.example.nivell2.exercici1.module.Person;

public class MainApp {
    public void execute() {
        Person person = new Person("Lucía", 31, true);
        JsonSerializer serializer = new JsonSerializer();

        try {
            serializer.serialize(person);
        } catch (Exception e) {
            System.err.println(" Error serializing object: " + e.getMessage());
        }
    }
}