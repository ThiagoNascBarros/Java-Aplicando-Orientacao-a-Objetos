package br.com.alura.screenmatch.challenges;

/*
* https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=bitcoin&x_cg_demo_api_key=CG-jG5Gsdc72kxYqmimQXVXHpf8
* */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ChallengeCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("Pesquise sua criptomoeda: ");
        var coin = input.nextLine().replace(" ", "+");

        var URL = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl,usd&ids=" + coin + "&x_cg_demo_api_key=CG-jG5Gsdc72kxYqmimQXVXHpf8";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
