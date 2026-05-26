package ej2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    public void calcularEnHistoriaUsuarioTest(){
        Tarea tarea1 = new Tarea(20);
        Tarea tarea2 = new Tarea(30);

        Spike spike1 = new Spike(60);

        HistoriaUsuario historiaUsuario = new HistoriaUsuario();

        historiaUsuario.añadirTarea(tarea1);
        historiaUsuario.añadirTarea(tarea2);

        assertEquals(110, historiaUsuario.calcularTiempo());
    }

    @Test
    public void calcularEnScrumTest(){
        Tarea tarea1 = new Tarea(40);
        Tarea tarea2 = new Tarea(40);

        Spike spike1 = new Spike(50);

        HistoriaUsuario historiaUsuario = new HistoriaUsuario();

        historiaUsuario.añadirTarea(tarea1);
        historiaUsuario.añadirTarea(tarea2);

        Scrum proyectoScrum = new Scrum();
        proyectoScrum.añadirItem(historiaUsuario);
        proyectoScrum.añadirItem(spike1);

        assertEquals(130, proyectoScrum.calcularTiempo());
    }
}
