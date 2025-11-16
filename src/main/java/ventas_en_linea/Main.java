package ventas_en_linea;

public class Main {

	public static void main(String[] args) {

	  Tienda tienda = new Tienda();
	      	
	   //Registro de Productos 
	    tienda.agregarProducto(new Producto("Laptop", 2500, 10));
	    tienda.agregarProducto(new Producto("Mouse", 50, 30));

	    System.out.println("=== Productos en stock antes de la venta ===");
	    tienda.mostrarProductos();

	    try {
	        	
	    //Venta de 2 Laptops
	      Venta v1 = tienda.comprar("Laptop", 2);
	      System.out.println("\n=== Ventas Realizadas ===");
	      System.out.println(v1);
	            
	     //Venta de 4 Mouses  
	       Venta v2 = tienda.comprar("Mouse", 4);
	       System.out.println(v2);
	       } catch (Exception e) {
	       System.out.println("ERROR: " + e.getMessage());
	      }

	    System.out.println("\n=== Productos en stock despues de la venta ===");
	    tienda.mostrarProductos();

	}
}
