package productos;

public abstract class Producto implements Productos {
    private String id;
    private String nombre;
    private String descripcion;
    private int precio;
    private Boolean vegan;
    private Boolean gluten;

    @Override
    public abstract void verprecio();
}