/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_marianorodriguezarce;

import java.util.Scanner;

/**
 *
 * @author nanos
 */
public class TP2_MarianoRodriguezArce {
    
    public static final double DESCUENTO_ESPECIAL = 0.10;

    
    public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TP2 - Programación Estructurada (Java) ===");
            System.out.println("1) Verificación de Año Bisiesto");
            System.out.println("2) Mayor de Tres Números");
            System.out.println("3) Clasificación de Edad");
            System.out.println("4) Calculadora de Descuento por Categoría");
            System.out.println("5) Suma de Números Pares (while, termina con 0)");
            System.out.println("6) Contador de Positivos, Negativos y Ceros (for, 10 números)");
            System.out.println("7) Validación de Nota (do-while, 0..10)");
            System.out.println("8) Función calcularPrecioFinal(impuesto, descuento)");
            System.out.println("9) Composición: costo de envío y total de compra");
            System.out.println("10) Actualizar stock (venta + recepción)");
            System.out.println("11) Descuento especial usando variable \"global\"");
            System.out.println("12) Arrays: modificar y mostrar (for-each)");
            System.out.println("13) Arrays: impresión recursiva antes y después de modificar");
            System.out.println("0) Salir");
            System.out.print("Elegí una opción: ");

            int op = input.nextInt();
            if (op == 0) {
                System.out.println("Nos vemos!");
                break;
            }

            switch (op) {
                case 1:
                    ejercicio1(input);
                    break;
                case 2:
                    ejercicio2(input);
                    break;
                case 3:
                    ejercicio3(input);
                    break;
                case 4:
                    ejercicio4(input);
                    break;
                case 5:
                    ejercicio5(input);
                    break;
                case 6:
                    ejercicio6(input);
                    break;
                case 7:
                    ejercicio7(input);
                    break;
                case 8:
                    ejercicio8(input);
                    break;
                case 9:
                    ejercicio9(input);
                    break;
                case 10:
                    ejercicio10(input);
                    break;
                case 11:
                    ejercicio11(input);
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                default:
                    System.out.println("Opción inválida!");
            }
        }
    }
     
    public static void ejercicio1(Scanner input){
        System.out.println("Ingrese un año para verificar si es bisiesto:");
        int anio = input.nextInt();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (bisiesto){
            System.out.println("El año " + anio + " es bisiesto");
        }        
        else{
            System.out.println("El año " + anio + " no es bisiesto");
        }            
    }
    
    public static void ejercicio2(Scanner input){
        System.out.println("Ingrese el primer número:");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = input.nextInt();    
        System.out.println("Ingrese el tercer número:");
        int num3 = input.nextInt();
        
        int mayorNum = Math.max(num1, Math.max(num2, num3));
        System.out.println("El mayor es: " + mayorNum);
    }
    
    public static void ejercicio3(Scanner input){
        System.out.println("Ingrese su edad:");
        int edad = input.nextInt();
        
        if(edad < 12){
            System.out.println("Eres un Niño");
        }else if(edad <= 17){
            System.out.println("Eres un Adolescente!");
        }else if(edad <= 59){
            System.out.println("Eres un Adulto!");
        }else{
            System.out.println("Eres un Adulto Mayor!");
        }
    }
    
    public static void ejercicio4(Scanner input){
        System.out.println("Ingrese el precio del producto:");
        double precio = input.nextDouble();
        input.nextLine();
        System.out.println("Ingrese la categoría del producto:");
        String categoria = input.nextLine().toUpperCase();
        
        int descuento = 0;
        switch (categoria) {
            case "A":
                descuento = 10;
                break;
            case "B":
                descuento = 15;
                break;
            case "C":
                descuento = 20;
                break;
            default:
                System.out.println("Categoría invalida, no se cargará ningun descuento!");
        }
        
        double montoDesc = precio * (descuento / 100.0);
        double precioFinal = precio - montoDesc;
        
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);
    }
    
    public static void ejercicio5(Scanner input){
        int acumulador = 0;
        
        while(true){
            System.out.println("Ingrese un número (0 para terminar):");
            int numeroIngresado =  input.nextInt();
            if(numeroIngresado == 0){
                break;
            }
            if(numeroIngresado % 2 == 0){
                acumulador += numeroIngresado;
            }            
        }
        
        System.out.println("La suma de los números pares es: " + acumulador);
    }
    
    public static void ejercicio6(Scanner input){
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        
        for(int i=1;i <= 10; i++){
            System.out.println("Ingrese el número " + i + ": ");
            int numeroIngresado =  input.nextInt();
            if(numeroIngresado > 0){
                contadorPositivos++;
            }else if(numeroIngresado < 0){
                contadorNegativos++;
            }else{
                contadorCeros++;
            }
        }
        
        System.out.println("Positivos: " + contadorPositivos);
        System.out.println("Negativos: " + contadorNegativos);
        System.out.println("Ceros: " + contadorCeros);
    }
    
    public static void ejercicio7(Scanner input){
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente");
    }
    
    public static double calcularPrecioFinal(double precioBase, double porcentajeImp, double porcentajeDesc) {
        double impuesto = precioBase * (porcentajeImp / 100.0);
        double descuento = precioBase * (porcentajeDesc / 100.0);
        return precioBase + impuesto - descuento;
    }
    
    public static void ejercicio8(Scanner input) {
        System.out.print("Ingrese el precio base del producto: ");
        double base = input.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(base, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        String z = zona.trim().toLowerCase();
        double precioKg;
        if (z.equals("nacional")) {
            precioKg = 5.0;
        } else if (z.equals("internacional")) {
            precioKg = 10.0;
        } else {
            return -1.0;
        }
        return precioKg * peso;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    private static void ejercicio9(Scanner input) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        input.nextLine();
        String zona = input.nextLine().trim();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Zona inválida. Use Nacional o Internacional.");
            return;
        }
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static void ejercicio10(Scanner input) {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendidos = input.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibidos = input.nextInt();

        int nuevoStock = actualizarStock(stockActual, vendidos, recibidos);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static void ejercicio11(Scanner input) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }
    
    public static void imprimirRecursivo(double[] arr, int i) {
        if (i == arr.length){
            return;
        };
        
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);
    }
    
    public static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }    
    
}
