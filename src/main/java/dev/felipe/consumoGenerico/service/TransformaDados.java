package dev.felipe.consumoGenerico.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransformaDados {

    public <T> T transformaJsonEmObjeto(String json, Class<T> classe) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(json, classe);
    }
}
