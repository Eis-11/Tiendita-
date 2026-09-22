import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {

    private List<Producto> listaProductos = new ArrayList<>();

    public void inicializar() {
        listaProductos.add(new Producto(1, "Soda", 20f));
        listaProductos.add(new Producto(2, "Galletas", 15f));
        listaProductos.add(new Producto(3, "Chicle", 2.5f));
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
        Scanner teclado = new Scanner(System.in);

        System.out.println("Codigo del producto a buscar:");
        int codigo = teclado.nextInt();

        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                System.out.println("\nProducto encontrado");
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Precio: $" + producto.getPrecio());
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }
}
