package menu;

import productos.Producto;
import productos.Tarta;
import utilidades.Utilidades;

import java.sql.Array;
import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

public class MenuInventario {
    //TODO: añadir los métodos para acceder a la lista desde aquí.
    public static ArrayList<Producto> listaProductos= new ArrayList<Producto>();
    public void mostrar(){
        int opcion;
        do {
            System.out.println("1.-Buscar información producto");
            System.out.println("2.-Modificar stock");
            System.out.println("3.-Renombrar producto");
            System.out.println("4.-Modificar precio");
            System.out.println("5.-Añadir nuevo producto");
            System.out.println("0.-Salir");
            opcion = Utilidades.pedirEntero();
            if(opcion<0||opcion>5){
                System.out.println("Introduce un número válido");
            }
        }while(opcion<0||opcion>5);
        switch(opcion){
            case 1:
                //TODO: Con hashmaps?
                break;
            case 2:
                //TODO: después de buscar
                break;
            case 3:
                //TODO: después de buscar
                break;
            case 4:
                //TODO: después de buscar
                break;
            case 5:
                this.opcionProductos();
                break;
            case 0:
                //TODO: después de buscar
                break;
        }
    }

    private void opcionProductos() {
        int opcion;
        do {
            System.out.println("1.-Tarta");
            System.out.println("2.-Pan");
            System.out.println("3.-Croissants");
            System.out.println("0.-Salir");
            opcion = Utilidades.pedirEntero();
            if(opcion<0||opcion>3){
                System.out.println("Introduce un número válido");
            }
        }while(opcion<0||opcion>3);
        switch(opcion){
            case 1:
                Tarta tarta=new Tarta();
                listaProductos.add(tarta);
                lecturaEscrituraDeFicheros.EscrituraFicheros.escribirProductos(listaProductos);
                System.out.println(tarta.toString());
                break;
            case 2:
                System.out.println("En construcción");
                break;
            case 3:
                System.out.println("En construcción");
                break;
            case 0:
                mostrar();
                break;
        }
    }

}
