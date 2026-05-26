package ej1;

import java.util.Objects;

public abstract class Empleado {
    protected double salario;

    public Empleado(double salario) {
        Objects.requireNonNull(salario);
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario negativo");
        }
        this.salario = salario;
    }

    public abstract double calcularSalario();
}
