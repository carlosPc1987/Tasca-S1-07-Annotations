package org.example.nivell2.exercici1.module;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class JsonSerializer {

    public void serialize(Object object) throws IOException {
        Class<?> clazz = object.getClass();

        if (!clazz.isAnnotationPresent(JsonExport.class)) {
            throw new IllegalArgumentException("Missing @JsonExport annotation");
        }

        JsonExport annotation = clazz.getAnnotation(JsonExport.class);
        String outputPath = annotation.path();

        StringBuilder json = new StringBuilder("{\n");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                Object value = fields[i].get(object);
                json.append("  \"").append(fields[i].getName()).append("\": ");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(",");
                }
                json.append("\n");
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot access field: " + fields[i].getName(), e);
            }
        }

        json.append("}");

        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(json.toString());
            System.out.println(" Objeto serializado correctamente en: " + outputPath);
        }
    }
}