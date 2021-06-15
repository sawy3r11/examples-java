package com.dk.exmaple.java11.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        var httpClient = HttpClient.newBuilder().build();

        var httpRequest = HttpRequest
                .newBuilder(URI.create("https://api.coindesk.com/v1/bpi/currentprice.json"))
                .GET()
                .build();
        var bodyHandler = HttpResponse.BodyHandlers.ofString();
        var httpResponse = httpClient.send(httpRequest, bodyHandler);

        System.out.println(httpResponse.body());
    }
}
