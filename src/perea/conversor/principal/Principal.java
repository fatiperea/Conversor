package perea.conversor.principal;

import com.google.gson.*;
import perea.conversor.modelos.TasaDeCambioER;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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

        //System.out.println(tasa);
        /*try {*/
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            JsonObject jsonObject = JsonParser.parseReader(new InputStreamReader(conn.getInputStream())).getAsJsonObject();
            double tasa=jsonObject.getAsJsonObject("conversion_rates").get(busqueda).getAsDouble();

            //System.out.println("jo "+jsonObject);

            System.out.println("tasa: "+tasa);

        /*    if (conn.getResponseCode() != 200) {
                System.out.println("Error al obtener datos de la API.");

            }
        }catch (Exception e){
            {
                e.printStackTrace();
        }*/



        /*JsonElement elemento = JsonParser.parseString(response.body());
        JsonObject objectRoot = elemento.getAsJsonObject();
        //Accediendo a JsonObject
        double tasa = objectRoot.get("conversion_rate").getAsDouble();*/

        //System.out.println(objectRoot);
        //System.out.println("tasa: "+tasa);

        /**/




    }
}

