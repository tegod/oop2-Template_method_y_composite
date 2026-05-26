package ej1;

public class EmpleadoRegular extends Empleado {

    public EmpleadoRegular(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
