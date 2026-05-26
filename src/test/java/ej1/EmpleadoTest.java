package ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    @Test
    public void calcularSalario() {
        EmpleadoRegular empleado1 = new EmpleadoRegular(100);
        EmpleadoRegular empleado2 = new EmpleadoRegular(100);
        EmpleadoRegular empleado3 = new EmpleadoRegular(100);
        EmpleadoRegular empleado4 = new EmpleadoRegular(100);

        LiderDeProyecto liderProyecto = new LiderDeProyecto(150);
        liderProyecto.añadirEmpleadoRegular(empleado1);
        liderProyecto.añadirEmpleadoRegular(empleado2);
        LiderDeProyecto liderProyecto2 = new LiderDeProyecto(150);
        liderProyecto2.añadirEmpleadoRegular(empleado3);
        liderProyecto2.añadirEmpleadoRegular(empleado4);

        MandoMedio mandoMedio = new MandoMedio(250);
        mandoMedio.añadirLiderDeProyecto(liderProyecto);
        mandoMedio.añadirLiderDeProyecto(liderProyecto2);

        Gerente gerente = new Gerente(700);
        gerente.añadirMandoMedio(mandoMedio);

        Director director = new Director(1200);
        director.añadirGerente(gerente);

        assertEquals(2850, director.calcularSalario());
    }
}
