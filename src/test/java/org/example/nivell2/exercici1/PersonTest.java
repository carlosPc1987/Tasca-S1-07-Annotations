package org.example.nivell2.exercici1;

import org.example.nivell2.exercici1.module.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getName_shouldReturnCorrectName() {
        Person person = new Person("Clara", 25, true);
        assertEquals("Clara", person.getName());
    }
}