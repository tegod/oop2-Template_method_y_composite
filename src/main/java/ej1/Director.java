package ej1;

import java.util.ArrayList;
import java.util.List;

public class Director extends Empleado {
    private List<Empleado> gerentes;

    public Director(double salario) {
        super(salario);
        gerentes = new ArrayList<Empleado>();
    }

    public void añadirGerente(Empleado empleado) {
        gerentes.add(empleado);
    }

    @Override
    public double calcularSalario() {
        double total = salario;

        for (Empleado gerente : gerentes) {
            total += gerente.calcularSalario();
        }

        return total;
    }
}
