package productos;

import utilidades.Utilidades;

public abstract class Producto implements Productos {
    private int stock;
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Boolean vegan;
    private Boolean gluten;
    public Producto(){
        System.out.println("Introduce un id");
        String id= Utilidades.pedirCadena();
        this.id = id;
        System.out.println("Introduce un nombre");
        String nombre= Utilidades.pedirCadena();
        this.nombre = nombre;
        System.out.println("Introduce una descripción");
        String descripcion= Utilidades.pedirCadena();
        this.descripcion = descripcion;
        System.out.println("Introduce un precio");
        double precio= Utilidades.pedirDecimal();
        this.precio=precio;
        System.out.println("¿Es vegano?");
        boolean vegan=Utilidades.pedirBoolean();
        this.vegan=vegan;
        System.out.println("¿Tiene gluten?");
        boolean gluten=Utilidades.pedirBoolean();
        this.gluten=gluten;
        System.out.println("¿Cuántas unidades hay?");
        int stock= Utilidades.pedirEntero();
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getGluten() {
        return gluten;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", vegan=" + vegan +
                ", gluten=" + gluten +
                ", stock=" + stock +
                '}';
    }

    @Override
    public abstract void verprecio();
}