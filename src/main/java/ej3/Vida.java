package ej3;

public class Vida implements Seguro {
    private double costo;

    public Vida(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
