package ej4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(LogTransaction log, int mesEnPromocion) {
        super(log, mesEnPromocion);
    }

    @Override
    public double calculoDeImpuestos(double precioProducto, boolean esMesPromocion) {
        if  (esMesPromocion) {
            return precioProducto * 0.15;
        } else {
            return precioProducto * 0.21;
        }
    }
}
