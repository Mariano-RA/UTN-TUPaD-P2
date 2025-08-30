/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = Math.max(0, edad);
    }

    public void mostrarInfo() {
        System.out.println("\n=== Mascota ===");

        System.out.println("Mascota: " + nombre + " \nEspecie: " + especie + "\nEdad: " + edad + " año(s)");
    }

    public void cumplirAnios() {
        edad++;
    }

}
