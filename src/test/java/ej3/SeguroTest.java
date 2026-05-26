package ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroTest {

    @Test
    public void seguroTest() {
        Seguro auto = new Automovil(2000);
        Seguro hogar = new Hogar(4000);

        PaqueteSeguros paqueteEstandar = new PaqueteSeguros();

        paqueteEstandar.agragarSeguro(auto);
        paqueteEstandar.agragarSeguro(hogar);
        double costo = paqueteEstandar.calcularCosto();

        assertEquals(5400, costo);
    }

    @Test
    public void DoblePaqueteSeguroTest() {
        Seguro auto = new Automovil(2000);
        Seguro hogar = new Hogar(4000);

        PaqueteSeguros paqueteEstandar = new PaqueteSeguros();
        paqueteEstandar.agragarSeguro(auto);
        paqueteEstandar.agragarSeguro(hogar);

        Seguro vida = new Vida(3000);

        PaqueteSeguros paquetePlus = new PaqueteSeguros();
        paquetePlus.agragarSeguro(vida);
        paquetePlus.agragarSeguro(paqueteEstandar);

        double costo = paquetePlus.calcularCosto();

        assertEquals(7560, costo);
    }
}
