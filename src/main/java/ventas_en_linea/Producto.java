package ventas_en_linea;

public class Producto {
	
	//Atributos privados
	private String nombre;
    private double precio;
    private int stock;

    // Constructor: inicializa un producto con su nombre, precio y stock
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    
    //Reduccion de stock del producto
    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - S/. " + precio + " - Stock: " + stock;
    }
}
