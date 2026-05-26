package ej2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements Item {
    private List<Item> ListaTareas;

    public HistoriaUsuario() {
        this.ListaTareas = new ArrayList<>();
    }

    public void añadirTarea(Item item) {
        this.ListaTareas.add(item);
    }

    @Override
    public int calcularTiempo() {
        int tiempoTotal = 0;

        for(Item item : ListaTareas) {
            tiempoTotal += item.calcularTiempo();
        }

        return tiempoTotal;
    }
}
