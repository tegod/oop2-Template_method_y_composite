package ej3;

public class Medicos implements Seguro {
    private double costo;

    public Medicos(double costo) {
        this.costo = costo;
    }

    @Override
    public double calcularCosto() {
        return costo;
    }
}
