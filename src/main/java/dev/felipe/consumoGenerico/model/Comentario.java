package dev.felipe.consumoGenerico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Comentario(@JsonAlias("name") String nome,
                         String email,
                         @JsonAlias("body") String corpo) {
}
