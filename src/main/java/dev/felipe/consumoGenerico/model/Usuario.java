package dev.felipe.consumoGenerico.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Usuario(String name,
                      String email,
                      String website) {
}
