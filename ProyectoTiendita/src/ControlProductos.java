
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

    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void Modificar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el ID del producto que deseas modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Producto producto : listaProductos) {

            if (producto.getId() == id) {

                System.out.print("Ingresa el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();

                System.out.print("Ingresa el nuevo precio: ");
                float nuevoPrecio = scanner.nextFloat();

                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);

                System.out.println("Producto modificado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró un producto con ese ID.");
    }
}
    
    
    

