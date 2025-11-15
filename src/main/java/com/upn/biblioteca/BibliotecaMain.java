package com.upn.biblioteca;

public class BibliotecaMain {
    public static void main(String[] args) {

        // Libro sin ISBN
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Libro libro1 = new Libro();

        try {
            libro1.registrarLibro("Cien Años de Soledad", autor1, 1967);
            System.out.println(" Libro registrado correctamente.\n");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // Libro con ISBN
        Autor autor2 = new Autor("J.K. Rowling", "Británica");
        Libro libro2 = new Libro();

        try {
            libro2.registrarLibro("Harry Potter y la Piedra Filosofal", autor2, 1997, "978-0747532699");
            System.out.println(" Libro registrado correctamente.\n");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Libro con error
        Autor autorError = autor1;
        Libro libroError = new Libro();
        boolean registrado = false;

        try {
            libroError.registrarLibro("", autorError, 2000);
            registrado = true;
            System.out.println(" Libro registrado correctamente.\n");
        } catch (Exception e) {
            System.out.println("ERROR al registrar libro: " + e.getMessage());
            System.out.println("El libro con datos inválidos no fue registrado.\n");
        }

        // Mostrar solo los libros válidos
        System.out.println(" LISTADO DE LIBROS REGISTRADOS:");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        if (registrado) {
            libroError.mostrarInformacion();
        }
    }
}
