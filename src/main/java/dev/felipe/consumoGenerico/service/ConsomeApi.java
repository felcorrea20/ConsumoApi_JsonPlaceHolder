package dev.felipe.consumoGenerico.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsomeApi {

    public String consomeJsonPlaceHolderPorId(String escolhaEndpoint, int escolhaId) throws IOException, InterruptedException {
        String endereco = "https://jsonplaceholder.typicode.com/" + escolhaEndpoint + escolhaId;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

}
