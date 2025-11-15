package com.upn.estudiantes;

public class EstudianteBecado extends  Estudiante {
    public EstudianteBecado(String nombre, Curso curso) {
        super(nombre, curso);
    }

    @Override
    public double calcularMensualidad() {
        return 200.0;  // paga menos por beca
    }

    @Override
    public void evaluar() {
        System.out.println(nombre + " está rindiendo examen especial para becados.");
    }
}
