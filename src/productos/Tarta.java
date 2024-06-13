package productos;

import utilidades.Utilidades;

public class Tarta extends Producto {
    //TODO: añadir opcion de porciones
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public Tarta() {
        super();
        System.out.println("Introduce un sabor");
        String sabor= Utilidades.pedirCadena();
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return super.toString()+"Tarta{" +
                ", sabor='" + sabor + '\'' +
                '}';
    }

    @Override
    public void verprecio() {

    }
}
