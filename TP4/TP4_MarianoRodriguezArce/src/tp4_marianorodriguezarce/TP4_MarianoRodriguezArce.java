/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class TP4_MarianoRodriguezArce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(100, "Mariano Rodriguez", "Desarrollador", 500000.0);
        Empleado e2 = new Empleado(101, "Santiago Lobo", "QA Analyst", 520000.0);

        Empleado e3 = new Empleado("Santiago Alvarado", "Project Manager");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(50000);
        e3.actualizarSalario(800000);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        System.out.println("\n\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }

}
