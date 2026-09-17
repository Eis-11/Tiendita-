
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {
    
    private List<Producto> listaProductos=new ArrayList();
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    void agregar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void ver() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void eliminar(){
        Scanner teclado = new Scanner(System.in);

          System.out.println("Ingresa el codigo del producto que deseas eliminar:");
          int codigo = teclado.nextInt();

          Producto producto = new Producto(codigo, "", 0);

         if (listaProductos.remove(producto)) {
            System.out.println("Producto eliminado correctamente.");
            } else {
                 System.out.println("Producto no encontrado.");
         }
    }
    
    
}
