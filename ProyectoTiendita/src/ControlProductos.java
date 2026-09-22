
import java.util.ArrayList;
import java.util.List;

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

    void buscar(int codigo) {
    for (Producto producto : listaProductos) {
        if (producto.getcodigo() == codigo) {
            System.out.println("Producto encontrado: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            return;
        }
    }

    System.out.println("Producto no encontrado");
} 
    }
