/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int idAutomatico = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id >= idAutomatico) {
            idAutomatico = id + 1;
        }
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = idAutomatico++;
        this.salario = 100000.0;
        totalEmpleados++;
    }

    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    @Override
    public String toString() {
        return "\n === Datos del Empleado ===" + "\n"
                + "ID: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Puesto: " + puesto + "\n"
                + "Salario: " + salario;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

}
