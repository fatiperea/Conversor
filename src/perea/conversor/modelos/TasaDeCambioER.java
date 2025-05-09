package perea.conversor.modelos;

import java.util.Map;

public record TasaDeCambioER(String result, String base_code, Map<String, Double> conversion_rates) {

}
