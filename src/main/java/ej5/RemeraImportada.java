package ej5;

public class RemeraImportada extends Remera {

    public RemeraImportada(int precio) {
        super(precio);
    }

    @Override
    double aplicarRecargo() {
        return precio * 0.03;
    }

    @Override
    double aplicarImpuesto() {
        return precio * 0.05;
    }

    @Override
    double aplicarBonificacion() {
        return 0.0;
    }

    @Override
    double aplicarAdicional() {
        return precio * 0.25;
    }
}
