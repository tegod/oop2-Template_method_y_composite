package ej4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

    public Calculador(LogTransaction log, int mesEnPromocion) {
        this.log = log;
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;

        boolean esMesPromocion = of(mesEnPromocion).equals(now().getMonth());

        precioTotal += calculoDeImpuestos(precioProducto, esMesPromocion);

        log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }

    abstract double calculoDeImpuestos(double precio, boolean esMesPromocion);
}
