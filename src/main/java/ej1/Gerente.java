package ej1;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado{
    List<Empleado> mandosMedios;

    public Gerente(double salario) {
        super(salario);
        mandosMedios = new ArrayList<Empleado>();
    }

    public void añadirMandoMedio(Empleado mandoMedio) {
        mandosMedios.add(mandoMedio);
    }

    @Override
    public double calcularSalario() {
        double total = salario;

        for (Empleado mandoMedio : mandosMedios) {
            total += mandoMedio.calcularSalario();
        }

        return total;
    }
}
