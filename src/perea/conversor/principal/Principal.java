package perea.conversor.principal;

import com.google.gson.*;
import perea.conversor.modelos.TasaDeCambioER;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura= new Scanner(System.in);
        System.out.println("moneda: ");
        var busqueda=lectura.nextLine();

        String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/latest/"+busqueda;

        URL url= new URL(direccion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json=response.body();

        Gson gson= new Gson();

        //TasaDeCambioER tasa= gson.fromJson(json, TasaDeCambioER.class);

        /*try {*/

        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
        double tasa= jsonObject.getAsJsonObject("conversion_rates").get(busqueda).getAsDouble();

            System.out.println("tasa: "+tasa);




    }
}

