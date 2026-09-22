
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
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Codigo del producto:"); 
        int codigo = teclado.nextInt(); 

        teclado.nextLine(); 

        System.out.println("Descripcion del producto:"); 
        String descripcion = teclado.nextLine(); 

        System.out.println("Precio del producto:"); 
        float precio = teclado.nextFloat(); 


        listaProductos.add(new Producto(codigo, descripcion, precio)); 

        System.out.println("Producto agregado correctamente."); 
    }
         
    

    void ver() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    
}
