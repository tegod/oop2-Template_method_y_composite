package ej3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros implements Seguro {
    private List<Seguro> paquete;

    public PaqueteSeguros() {
        this.paquete = new ArrayList<>();
    }

    public void agragarSeguro(Seguro seguro) {
        this.paquete.add(seguro);
    }

    @Override
    public double calcularCosto() {
        int total = 0;

        for  (Seguro seguro : paquete) {
            total += seguro.calcularCosto();
        }

        double porcentajeDescontado = paquete.size() * 0.05;

        return total * (1.0 - porcentajeDescontado);
    }
}
