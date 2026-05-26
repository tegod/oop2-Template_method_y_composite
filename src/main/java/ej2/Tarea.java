package ej2;

public class Tarea implements Item {
    private int tiempo;

    public Tarea(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int calcularTiempo() {
        return tiempo;
    }
}
