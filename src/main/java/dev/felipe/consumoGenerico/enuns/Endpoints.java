package dev.felipe.consumoGenerico.enuns;

public enum Endpoints {
    USUARIO("users/"),
    POST("posts/"),
    COMENTARIO("comments/");

    final private String endpoint;

    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}