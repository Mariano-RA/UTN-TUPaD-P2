/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_marianorodriguezarce.Actividad_1.Ejercicio_1;

/**
 *
 * @author nanos
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // v�nculo bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setPasaporte(Pasaporte p) {
        this.pasaporte = p;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}