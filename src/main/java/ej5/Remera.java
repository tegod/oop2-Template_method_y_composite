package ej5;

public abstract class Remera {
    protected double precio;

    public Remera(double precio) {
        this.precio = precio;
    }

    public double calcularPrecio() {
        double precioFinal = precio;

        precioFinal += aplicarRecargo();

        precioFinal += aplicarImpuesto();

        precioFinal += aplicarBonificacion();

        precioFinal += aplicarAdicional();

        return precioFinal;
    }

    abstract double aplicarRecargo();
    abstract double aplicarImpuesto();
    abstract double aplicarBonificacion();
    abstract double aplicarAdicional();
}
