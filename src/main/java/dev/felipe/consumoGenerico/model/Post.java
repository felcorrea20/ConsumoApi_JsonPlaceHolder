package dev.felipe.consumoGenerico.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Post(@JsonAlias("userId") int idUsuariro,
                   @JsonAlias("title") String titulo,
                   @JsonAlias("body") String corpoPost) {
}
