package menu;

import utilidades.Utilidades;

public class MenuInventario {
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
        }while(opcion<0||opcion>1);

    }

}
