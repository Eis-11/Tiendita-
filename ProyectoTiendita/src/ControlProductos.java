import java.util.ArrayList;
import java.util.List;

public class ControlProductos {

    private List<Producto> listaProductos = new ArrayList<>();

    public void inicializar() {
        listaProductos.add(new Producto(1, "Soda", 20f));
        listaProductos.add(new Producto(2, "Galletas", 15f));
        listaProductos.add(new Producto(3, "Chicle", 2.5f));
    }

    void agregar() {
        throw new UnsupportedOperationException("En construcción.");
    }

    void ver() {

        System.out.println("\nLISTA DE PRODUCTOS");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s %-20s %-10s%n",
                "CODIGO", "DESCRIPCION", "PRECIO");
        System.out.println("---------------------------------------------");

        for (Producto producto : listaProductos) {
            System.out.printf("%-10d %-20s $%.2f%n",
                    producto.getCodigo(),
                    producto.getDescripcion(),
                    producto.getPrecio());
        }

        System.out.println("---------------------------------------------");
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción.");
    }
}