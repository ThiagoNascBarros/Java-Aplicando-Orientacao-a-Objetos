package br.com.alura.screenmatch.challenges;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ChallengeTheMealDB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pesquise sua receita: ");
        var book = input.nextLine().replace(" ", "+");

        var URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + book;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
