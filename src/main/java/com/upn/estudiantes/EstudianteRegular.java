package com.upn.estudiantes;

public class EstudianteRegular extends Estudiante{
    public EstudianteRegular(String nombre, Curso curso) {
        super(nombre, curso);
    }

    @Override
    public double calcularMensualidad() {
        return 500.0;  // cuota normal
    }

    @Override
    public void evaluar() {
        System.out.println(nombre + " está rindiendo examen regular.");
    }


}
