package com.upn.estudiantes;

public abstract class Estudiante implements Evaluable {
    protected String nombre;
    protected Curso curso;

    public Estudiante(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    // Método polimórfico
    public abstract double calcularMensualidad();
}


