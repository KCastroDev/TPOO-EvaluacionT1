package com.upn.estudiantes;

public class Main {
    public static void main(String[] args) {

        // Crear un curso (puedes cambiar el nombre y créditos)
        Curso c1 = new Curso("Matemática", 4);

        Estudiante e1 = new EstudianteRegular("Kevin", c1);
        Estudiante e2 = new EstudianteBecado("María", c1);

        e1.evaluar();
        e2.evaluar();

        System.out.println("Mensualidad Kevin: " + e1.calcularMensualidad());
        System.out.println("Mensualidad María: " + e2.calcularMensualidad());
    }
}
