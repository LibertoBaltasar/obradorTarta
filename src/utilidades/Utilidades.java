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
    public static double pedirDecimal(){
        boolean valido=false;
        double decimal=-9999;

        System.out.println("Introduce un número entero");
        do{
            try{
                limpiarBuffer();
                decimal= teclado.nextDouble();
                valido=true;
            }catch (Exception e){
                System.out.println("Introduce un número válido");
            }
        }while(!valido);
        return decimal;
    }
    public static boolean pedirBoolean(){
        boolean valido=false;
        boolean devuelto;
        int opcion;

        do{
            System.out.println("Introduce un 1 para verdadero");
            System.out.println("Introduce un 2 para falso");
            opcion=pedirEntero();
        }while(opcion<1||opcion>2);
        if(opcion==1){
            devuelto=true;
        }else{
            devuelto=false;
        }
        return devuelto;
    }
    private static void limpiarBuffer(){
        if(teclado.hasNext()){
            teclado.nextLine();
        }
    }
}
