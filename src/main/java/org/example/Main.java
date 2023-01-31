package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=e38fa90633074ac9ab30489c0f0c5101&include=minutely";

        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
    }
}