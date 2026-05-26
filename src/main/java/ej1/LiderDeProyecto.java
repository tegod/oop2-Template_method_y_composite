package ej1;

import java.util.ArrayList;
import java.util.List;

public class LiderDeProyecto extends Empleado {
    List<Empleado> empleadosRegulares;

    public LiderDeProyecto(double salario) {
        super(salario);
        empleadosRegulares = new ArrayList<Empleado>();
    }

    public void añadirEmpleadoRegular(Empleado empleadoRegular) {
        empleadosRegulares.add(empleadoRegular);
    }

    @Override
    public double calcularSalario() {
        double total = salario;

        for (Empleado regular : empleadosRegulares) {
            total += regular.calcularSalario();
        }

        return total;
    }
}
