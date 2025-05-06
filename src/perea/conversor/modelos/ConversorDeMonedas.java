package perea.conversor.modelos;

public class ConversorDeMonedas {
    private Moneda monedaBase;
    private Moneda monedaDestino;

    public ConversorDeMonedas(Moneda monedaBase, Moneda monedaDestino) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
    }

    public double convertir(double cantidad){

        return (cantidad/monedaBase.getTasaDeCambio())*monedaDestino.getTasaDeCambio();

    }
}
