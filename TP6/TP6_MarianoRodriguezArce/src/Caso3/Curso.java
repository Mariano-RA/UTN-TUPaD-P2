/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso3;

/**
 *
 * @author nanos
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

 
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;

        Profesor anterior = this.profesor;
        this.profesor = p;

        if (anterior != null) {
            anterior.getCursos().remove(this);
        }
        if (p != null) {
            if (!p.getCursos().contains(this)) {
                p.getCursos().add(this);
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " | " + nombre + " | Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + (profesor != null ? (" (" + profesor.getNombre() + ")") : " (Sin profesor)");
    }
}
