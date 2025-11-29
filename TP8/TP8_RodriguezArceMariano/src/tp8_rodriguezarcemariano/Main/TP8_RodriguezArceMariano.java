/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8_rodriguezarcemariano.Main;

import Exceptions.EdadInvalidaException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nanos
 */
public class TP8_RodriguezArceMariano {

    public static void main(String[] args) {

        divisionSegura();
        conversionCadena();
        lecturaArchivo();
        excepcionPersonalizada();
        lecturaConTryResources();
    }

    public static void divisionSegura() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero!!!");
        }
    }

    public static void conversionCadena() {
        try {
            String txt = "abc";
            int numero = Integer.parseInt(txt);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir la cadena a numero.");
        }
    }

    public static void lecturaArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo.");
        }
    }

    public static void excepcionPersonalizada() {
        try {
            validarEdad(150);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango permitido.");
        }
    }

    public static void lecturaConTryResources() {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo2.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo con try-with-resources.");
        }
    }
}
