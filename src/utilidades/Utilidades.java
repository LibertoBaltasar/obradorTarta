package utilidades;

import java.util.Scanner;

public class Utilidades {
    private static Scanner teclado= new Scanner (System.in);
    public static String pedirCadena(){
        limpiarBuffer();
        System.out.println("Introduce una cadena de texto");
        String cadena=teclado.nextLine();
        return cadena;
    }
    public static int pedirEntero(){
        boolean valido=false;
        int entero=-9999;

        System.out.println("Introduce un número entero");
        do{
            try{
                limpiarBuffer();
                entero= teclado.nextInt();
                valido=true;
            }catch (Exception e){
                System.out.println("Introduce un número válido");
            }
        }while(!valido);
        return entero;
    }
    private static void limpiarBuffer(){
        teclado.nextLine();
    }
}
