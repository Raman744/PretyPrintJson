package com.printjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.printjson.Entity.User;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        User bean = new User(1, "Ramesh", "Fadatare", "Ramesh Fadatare");
        String result = mapper.writeValueAsString(bean);

        System.out.println(result);
    }

}
