package ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemeraTest {

    @Test
    public void aplicarPrecioImportadaTest() {
        Remera remera = new RemeraImportada(3000);

        double precio = remera.calcularPrecio();

        assertEquals(3990, precio);
    }

    @Test
    public void aplicarPrecioNacionalTest() {
        Remera remera = new RemeraNacional(2000, 1000);

        double precio = remera.calcularPrecio();

        assertEquals(2715, precio);
    }
}
