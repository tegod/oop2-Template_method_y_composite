package ej2;

import java.util.ArrayList;
import java.util.List;

public class Scrum implements Item {
    private List<Item> items;

    public Scrum() {
        this.items = new ArrayList<>();
    }

    public void añadirItem(Item item) {
        this.items.add(item);
    }

    @Override
    public int calcularTiempo() {
        int tiempoTotal = 0;

        for(Item item : this.items) {
            tiempoTotal += item.calcularTiempo();
        }

        return tiempoTotal;
    }
}
