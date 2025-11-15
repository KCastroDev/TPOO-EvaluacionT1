package com.upn.biblioteca;

public class Libro {
    // Atributos
    private String titulo;
    private Autor autor;
    private int anio;
    private String isbn;

    //Constructor vacio
    public Libro() {
    }

    // Metodo sobrecargado sin ISBN
    public void registrarLibro(String titulo, Autor autor, int anio){
        if(titulo==null || titulo.trim().isEmpty()){
            throw  new IllegalArgumentException("El titulo no puede ser nulo o vacio");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isbn = "ISBN no proporcionado";
    }
    // Metodo sobrecargado con ISBN
    public void registrarLibro(String titulo, Autor autor, int anio, String isbn){
        if(titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("El titulo no puede ser nulo o vacio");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.isbn = isbn;
    }
    // metodo para mostrar informacion del libro
    public void mostrarInformacion() {
        if (titulo == null || autor == null) {
            System.out.println(" No se puede mostrar información: libro incompleto.");
            return;
        }
        System.out.println("========== LIBRO ==========");
        System.out.println("Título      : " + titulo);
        System.out.println("Autor       : " + autor.getNombre());
        System.out.println("Año         : " + anio);
        System.out.println("ISBN        : " + isbn);
        System.out.println("===========================\n");
    }


}
