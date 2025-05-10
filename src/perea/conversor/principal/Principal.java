package perea.conversor.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import perea.conversor.modelos.TasaDeCambioER;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura= new Scanner(System.in);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.
                UPPER_CAMEL_CASE).setPrettyPrinting().create();

        var busqueda=lectura.nextLine();

        String direccion="https://v6.exchangerate-api.com/v6/98940a4ca8e53fb94f327ebb/latest/"+busqueda;

        System.out.println("Tipo de moneda: ");

        //String json;
        //TasaDeCambioER tasa= gson.fromJson(json, TasaDeCambioER.class);


    }
}
