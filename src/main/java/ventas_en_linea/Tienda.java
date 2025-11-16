package ventas_en_linea;

import java.util.ArrayList;

public class Tienda {
	
	//Creacion  de un ArrayList para almacenar los productos
	ArrayList<Producto> productos = new ArrayList<>();

    // Agregar un producto a la Tienda
	public void agregarProducto(Producto p) {
        productos.add(p);
    }

    //Muestra los productos de Tienda
	public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
	
    // MÉTODO PARA REALIZAR UNA COMPRA
    public Venta comprar(String nombreProducto, int cantidad) throws Exception {

        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {

                if (p.getStock() < cantidad) {
                    throw new Exception("Stock insuficiente para " + nombreProducto);
                }

                p.reducirStock(cantidad);

                double total = p.getPrecio() * cantidad;

                return new Venta(nombreProducto, cantidad, total);
            }
        }

        throw new Exception("Producto no encontrado");
    }
}
