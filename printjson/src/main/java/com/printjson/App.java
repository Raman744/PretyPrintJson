package com.printjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.printjson.Entity.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "Raman", "Shah", "Raman Shah");

        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(result);

    }
}
