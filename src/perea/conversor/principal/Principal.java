package perea.conversor.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import perea.conversor.modelos.TasaDeCambioER;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Scanner lectura= new Scanner(System.in);
        //var busqueda=lectura.nextLine();

        String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/latest/USD";//+busqueda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        String json=response.body();



        /*Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.
                UPPER_CAMEL_CASE).setPrettyPrinting().create();

        System.out.println("Tipo de moneda: ");*/

        //String json;
        //TasaDeCambioER tasa= gson.fromJson(json, TasaDeCambioER.class);


    }
}
