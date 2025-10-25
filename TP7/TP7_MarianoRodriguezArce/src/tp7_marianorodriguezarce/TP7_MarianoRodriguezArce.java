/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_marianorodriguezarce;

import Caso1.Auto;
import Caso2.Circulo;
import Caso2.Figura;
import Caso2.Rectangulo;
import Caso3.Empleado;
import Caso3.EmpleadoPlanta;
import Caso3.EmpleadoTemporal;
import Caso4.*;
import java.util.ArrayList;

/**
 *
 * @author nanos
 */
public class TP7_MarianoRodriguezArce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // ===========================================================
        // CASO 1 - VEHÍCULOS Y HERENCIA BÁSICA
        // ===========================================================
        System.out.println("===== CASO 1: VEHÍCULOS =====");
        Auto auto1 = new Auto("Toyota", "Corolla", 4);
        auto1.mostrarInfo();
        System.out.println();

        // ===========================================================
        // CASO 2 - FIGURAS GEOMÉTRICAS Y MÉTODOS ABSTRACTOS
        // ===========================================================
        System.out.println("===== CASO 2: FIGURAS GEOMÉTRICAS =====");
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);

        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Área: " + String.format("%.2f", f.calcularArea()));
            System.out.println("-----------------------------");
        }
        System.out.println();

        // ===========================================================
        // CASO 3 - EMPLEADOS Y POLIMORFISMO
        // ===========================================================
        System.out.println("===== CASO 3: EMPLEADOS =====");
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 200000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 8000));

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado temporal");
            }

            System.out.println("-----------------------------");
        }
        System.out.println();

        // ===========================================================
        // CASO 4 - ANIMALES Y COMPORTAMIENTO SOBRESCRITO
        // ===========================================================
        System.out.println("===== CASO 4: ANIMALES =====");
        Animal[] animales = {new Perro(), new Gato(), new Vaca()};

        for (Animal a : animales) {
            System.out.print(a.getClass().getSimpleName() + ": ");
            a.hacerSonido();
        }

    }

}
