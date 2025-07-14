package org.example.nivell2.exercici1;

import org.example.nivell2.exercici1.module.JsonSerializer;
import org.example.nivell2.exercici1.module.Person;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonSerializerTest {

    @Test
    void shouldGenerateJsonFileWhenSerializingPerson() throws Exception {

        Person person = new Person("Mario", 45, false);
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(person);
        File jsonFile = new File("output/person.json");
        assertTrue(jsonFile.exists(), " El archivo JSON no se ha generado");
    }
}
