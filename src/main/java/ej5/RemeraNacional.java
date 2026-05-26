package ej5;

public class RemeraNacional extends Remera {
    private double precioTransporte;

    public RemeraNacional(double precio, double precioTransporte) {
        super(precio);
        this.precioTransporte = precioTransporte;
    }

    @Override
    double aplicarRecargo() {
        return precioTransporte * 0.015;
    }

    @Override
    double aplicarImpuesto() {
        return 0.0;
    }

    @Override
    double aplicarBonificacion() {
        return precio * 0.2;
    }

    @Override
    double aplicarAdicional() {
        return precio * 0.15;
    }
}
