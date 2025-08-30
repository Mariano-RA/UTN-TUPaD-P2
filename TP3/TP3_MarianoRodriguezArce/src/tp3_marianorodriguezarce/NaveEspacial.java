/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class NaveEspacial {

    private String nombre;
    private int combustible;
    private int capacidad;

    public NaveEspacial(String nombre, int combustible, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.combustible = Math.min(combustible, this.capacidad);
    }

    public void despegar() {
        System.out.println(nombre + " esta despegando!");
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        if (combustible < distancia) {
            System.out.println("No hay combustible suficiente para avanzar " + distancia + " km. Puedes avanzar: " + combustible + " km");
            return;
        }        
        combustible -= distancia;
        System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible + " lts");
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            int nuevoNivel = combustible + cantidad;
            if (nuevoNivel > capacidad) {
                int combustibleRecargado = capacidad - combustible;
                combustible = capacidad;
                System.out.println("Se recargaron " + combustibleRecargado + " unidades. La nave tiene el tanque lleno");
            } else {
                combustible = nuevoNivel;
                System.out.println("Se recargaron " + cantidad + " lts. Ahora tienes " + combustible + " lts de combustible disponible.");
            }
        } else {
            System.out.println("La cantidad a recargar debe ser positiva.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave '" + nombre + "' – Combustible: " + combustible + "/" + capacidad);
    }
}
