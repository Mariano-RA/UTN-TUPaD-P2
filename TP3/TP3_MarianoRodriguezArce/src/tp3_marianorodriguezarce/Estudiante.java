/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("\n=== Datos del Estudiante ===");
        System.out.println("Nombre: " + nombre + " " + apellido + "\nCurso: " + curso + "\nCalificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion = Math.min(10.0, calificacion + puntos);
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion = Math.max(0.0, calificacion - puntos);
        }
    }
}
