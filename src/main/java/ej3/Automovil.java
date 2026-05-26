package ej3;

public class Automovil implements Seguro {
    private double costo;

    public Automovil(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
