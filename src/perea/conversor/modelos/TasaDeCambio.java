//package perea.conversor.modelos;

//public class TasaDeCambio {

    /*
    import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class ExchangeRateAPI {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/TU_CLAVE_API/latest/";

    public static double obtenerTasa(String monedaBase, String monedaDestino) {
        try {
            URL url = new URL(API_URL + monedaBase);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                System.out.println("Error al obtener datos de la API.");
                return -1;
            }

            Scanner scanner = new Scanner(conn.getInputStream());
            String jsonResponse = "";
            while (scanner.hasNext()) {
                jsonResponse += scanner.nextLine();
            }
            scanner.close();

            JSONObject jsonObject = new JSONObject(jsonResponse);
            return jsonObject.getJSONObject("conversion_rates").getDouble(monedaDestino);

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}

    * */


//}
