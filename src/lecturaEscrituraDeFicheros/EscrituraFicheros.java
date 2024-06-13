package lecturaEscrituraDeFicheros;

import productos.Producto;
import productos.Tarta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class EscrituraFicheros {
    private static final String RUTA_LISTA_PRODUCTOS="src/ficheros/productos.txt";
    public static void escribirProductos(ArrayList<Producto>listaProductos){
        try{
            Path path= Paths.get(RUTA_LISTA_PRODUCTOS);
            if(Files.exists(path)){
                Files.createFile(path);
            }
                Producto producto;
                for (int i = 0; i < listaProductos.size(); i++) {
                    String lineafichero="";
                    producto = listaProductos.get(i);
                    if(producto instanceof Tarta){
                        lineafichero="Tarta;"+producto.getId()+";"+producto.getNombre()+";"+producto.getDescripcion()+";"+producto.getPrecio()+";"+producto.getGluten()+";"+producto.getVegan()+";"+producto.getStock()+";"+((Tarta) producto).getSabor();
                    }
                    if (i == 0) {
                        Files.write(path, lineafichero.getBytes(), StandardOpenOption.WRITE);
                    }else{
                        Files.write(path, lineafichero.getBytes(), StandardOpenOption.APPEND);
                    }
                }

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("No se ha escrito");
        }
    }
}
