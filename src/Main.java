import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*Scanner input = new Scanner(System.in);

        System.out.print("Digite seu filme: ");
        var filme = input.next();
        */

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create("https://www.omdbapi.com/?t=" + filme + "&apikey=abd3a916"))
                .uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=abd3a916"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
