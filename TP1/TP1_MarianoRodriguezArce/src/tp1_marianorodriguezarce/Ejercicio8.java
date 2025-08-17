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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        double num1 = input.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 = input.nextDouble();
        
        double divison = num1 / num2;
        
        System.out.println("El resultado de la division es: " + divison);
    }
}
