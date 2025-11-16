package com.upn.ventas_en_linea;

public class Venta {

	//Datos de la venta 
	private String producto;
    private int cantidad;
    private double total;

    //Registra los datos de la venta
    public Venta(String producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta: " + producto + " | Cantidad: " + cantidad + " | Total: S/. " + total;
    }
	
}
