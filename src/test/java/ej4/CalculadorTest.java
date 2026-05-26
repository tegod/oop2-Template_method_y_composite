package ej4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    private LogTransaction log;


    @Test
    public void calcularPrecioConPromocion(){
        Calculador calcular = new CalculadorJubilado(new LogTransaction(), LocalDate.now().getMonthValue());

        assertEquals(100, calcular.calcularPrecio(100));
    }

    @Test
    public void calcularPrecioSinPromocion(){
        Calculador calcular = new CalculadorJubilado(new LogTransaction(), LocalDate.now().getMonthValue() - 1);

        assertEquals(110, calcular.calcularPrecio(100));
    }
}
