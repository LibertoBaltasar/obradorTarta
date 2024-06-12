package productos;

import utilidades.Utilidades;

public abstract class Tarta extends Producto {
    String cobertura;
    String sabor;
    int stock;

    public Tarta() {
        super();
        String cobertura= Utilidades.pedirCadena();
        this.cobertura = cobertura;
        String sabor= Utilidades.pedirCadena();
        this.sabor = sabor;
        int stock= Utilidades.pedirEntero();
        this.stock = stock;
    }
}
