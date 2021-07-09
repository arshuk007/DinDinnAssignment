package com.example.dindinn.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JsonSerializer {

    public static String toJsonString(Object object) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Object toJsonObject(String message, Class mapperClassName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(message, mapperClassName);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static Object arrayToJsonObject(String message,
                                           Class mapperClassName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(message,
                    TypeFactory.defaultInstance().constructArrayType(mapperClassName));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
