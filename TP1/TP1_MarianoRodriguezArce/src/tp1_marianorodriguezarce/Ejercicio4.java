/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_marianorodriguezarce;

import java.util.Scanner;

/**
 *
 * @author nanos
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);    
    }
}
