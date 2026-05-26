package ej1;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends Empleado {
    List<Empleado> lideresDeProyectos;

    public MandoMedio(double salario) {
        super(salario);
        lideresDeProyectos = new ArrayList<Empleado>();
    }

    public void añadirLiderDeProyecto(Empleado liderDeProyecto) {
        lideresDeProyectos.add(liderDeProyecto);
    }

    @Override
    public double calcularSalario() {
        double total = salario;

        for (Empleado l : lideresDeProyectos) {
            total += l.calcularSalario();
        }

        return total;
    }
}
