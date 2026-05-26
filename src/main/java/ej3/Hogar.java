package ej3;

public class Hogar implements Seguro {
    private double costo;

    public Hogar(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
