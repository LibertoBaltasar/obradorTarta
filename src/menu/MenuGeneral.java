package menu;

import utilidades.Utilidades;

public class MenuGeneral {
    public void mostrar(){
        int opcion;
        do {
            System.out.println("1.-Inventario");
            System.out.println("0.-Salir");
            opcion = Utilidades.pedirEntero();
        }while(opcion<0||opcion>1);
        switch(opcion){
            case 1:
                MenuInventario menuInventario= new MenuInventario();
                menuInventario.mostrar();
                break;
            case 0:
                break;
        }
    }
}
