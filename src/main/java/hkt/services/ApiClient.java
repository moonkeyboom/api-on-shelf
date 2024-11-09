package hkt.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_URL = "http://localhost:8000/api/process-data";

    public static String sendData(String text, int state) throws Exception {
        // Create JSON payload
        String json = String.format("{\"text\": \"%s\", \"state\": %d}", text, state);

        // Create an HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(API_URL))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        // Send the request and receive a response
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();  // Response data from the FastAPI backend
    }
}

