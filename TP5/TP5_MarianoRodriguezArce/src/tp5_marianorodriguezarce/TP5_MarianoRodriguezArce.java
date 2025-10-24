/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_marianorodriguezarce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Scanner;

public class TP5_MarianoRodriguezArce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TP5 - Selección de Ejercicio ===");
            System.out.println("1)  Ejercicio 1");
            System.out.println("2)  Ejercicio 2");
            System.out.println("3)  Ejercicio 3");
            System.out.println("4)  Ejercicio 4");
            System.out.println("5)  Ejercicio 5");
            System.out.println("6)  Ejercicio 6");
            System.out.println("7)  Ejercicio 7");
            System.out.println("8)  Ejercicio 8");
            System.out.println("9)  Ejercicio 9");
            System.out.println("10) Ejercicio 10");
            System.out.println("11) Ejercicio 11");
            System.out.println("12) Ejercicio 12");
            System.out.println("13) Ejercicio 13");
            System.out.println("14) Ejercicio 14");
            System.out.println("99) Ejecutar TODOS (1→14)");
            System.out.println("0)  Salir");
            System.out.print("Elegí una opción: ");

            int op = input.nextInt();            

            switch (op) {
                case 1 -> {
                    System.out.println("[EJ1] -------------------------------");
                    Ejercicio1();
                }
                case 2 -> {
                    System.out.println("[EJ2] -------------------------------");
                    Ejercicio2();
                }
                case 3 -> {
                    System.out.println("[EJ3] -------------------------------");
                    Ejercicio3();
                }
                case 4 -> {
                    System.out.println("[EJ4] -------------------------------");
                    Ejercicio4();
                }
                case 5 -> {
                    System.out.println("[EJ5] -------------------------------");
                    Ejercicio5();
                }
                case 6 -> {
                    System.out.println("[EJ6] -------------------------------");
                    Ejercicio6();
                }
                case 7 -> {
                    System.out.println("[EJ7] -------------------------------");
                    Ejercicio7();
                }
                case 8 -> {
                    System.out.println("[EJ8] -------------------------------");
                    Ejercicio8();
                }
                case 9 -> {
                    System.out.println("[EJ9] -------------------------------");
                    Ejercicio9();
                }
                case 10 -> {
                    System.out.println("[EJ10] ------------------------------");
                    Ejercicio10();
                }
                case 11 -> {
                    System.out.println("[EJ11] ------------------------------");
                    Ejercicio11();
                }
                case 12 -> {
                    System.out.println("[EJ12] ------------------------------");
                    Ejercicio12();
                }
                case 13 -> {
                    System.out.println("[EJ13] ------------------------------");
                    Ejercicio13();
                }
                case 14 -> {
                    System.out.println("[EJ14] ------------------------------");
                    Ejercicio14();
                }
                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida. Probá de nuevo.");
            }
        }
    }

    public static void Ejercicio1() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Titular t = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Titular(
                "Ana", "43523626");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Foto f = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Foto(
                new byte[] { 1, 2, 3 }, "JPG");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Pasaporte p = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_1.Pasaporte(
                "AR123456", LocalDate.of(2024, 5, 10), f, t);
        System.out.println(p);
        System.out.println("Titular ve su pasaporte: " + t.getPasaporte());
    }

    public static void Ejercicio2() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Usuario u = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Usuario(
                "Valentín", "43523626");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Bateria b = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Bateria(
                "BP-615", 5000);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Celular c = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_2.Celular(
                "357123456789012", "Xiaomi", "Redmi 13", b, u);
        System.out.println(c);
        System.out.println("Usuario ve su celular: " + u.getCelular());
    }

    public static void Ejercicio3() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Autor a = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Autor(
                "B. Kernighan", "EE.UU.");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Editorial e = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Editorial(
                "Prentice Hall", "New Jersey");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Libro l = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_3.Libro(
                "C Programming Language", "978-0131103627", a, e);
        System.out.println(l);
    }

    public static void Ejercicio4() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.Banco b = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.Banco(
                "Banco Nación", "30-50001008-4");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.Cliente c = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.Cliente(
                "María", "30123456");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.TarjetaDeCredito t = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_4.TarjetaDeCredito(
                "4509 1234 5678 9000", YearMonth.of(2028, 6), c, b);
        System.out.println(t);
        System.out.println("Cliente conoce su tarjeta: " + c.getTarjeta());
    }

    public static void Ejercicio5() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.PlacaMadre placa = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.PlacaMadre(
                "MSI B450", "AMD B450");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.Computadora comp = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.Computadora(
                "Lenovo", "SN-001", placa);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.Propietario prop = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_5.Propietario(
                "Luis", "20333444");

        comp.setPropietario(prop);

        System.out.println(comp);
        System.out.println("Propietario ve su computadora: " + prop.getComputadora());
    }

    public static void Ejercicio6() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Cliente cl = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Cliente(
                "Laura", "1122334455");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Mesa m = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Mesa(
                7, 4);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Reserva r = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_6.Reserva(
                LocalDate.of(2025, 10, 10), "20:30", cl, m);
        System.out.println(r);
        System.out.println("Cliente: " + r.getCliente().getNombre() + " | Mesa: " + r.getMesa().getNumero());
    }

    public static void Ejercicio7() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Motor motor = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Motor(
                "Nafta", "MTR-9876");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Vehiculo veh = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Vehiculo(
                "ABC123", "Onix", motor);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Conductor cond = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_7.Conductor(
                "Raúl Robino", "L-99988877");
        veh.setConductor(cond);
        System.out.println(veh);
        System.out.println("Conductor del vehículo: " + veh.getConductor().getNombre());
    }

    public static void Ejercicio8() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.Usuario us = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.Usuario(
                "Jonathan Ríos", "jonathan@mail.com");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.FirmaDigital firma = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.FirmaDigital(
                "ABC123HASH", LocalDateTime.now(), us);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.Documento doc = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_8.Documento(
                "Contrato", "Contenido del documento", firma);
        System.out.println(doc);
        System.out.println("Firmado por: " + doc.getFirmaDigital().getUsuario().getNombre());
    }

    public static void Ejercicio9() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.Paciente pac = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.Paciente(
                "Carlos Méndez", "OSDE");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.Profesional prof = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.Profesional(
                "Dra. Suárez", "Cardiología");
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.CitaMedica cita = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_9.CitaMedica(
                LocalDate.now(), "14:00", pac, prof);
        System.out.println(cita);
        System.out.println("Cita con " + cita.getProfesional().getNombre() + " para " + cita.getPaciente().getNombre());
    }

    public static void Ejercicio10() {
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.ClaveSeguridad clave = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.ClaveSeguridad(
                "ABC123", LocalDateTime.now());
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.CuentaBancaria cuenta = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.CuentaBancaria(
                "00000000111122223333", 50000.0, clave);
        tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.Titular tit = new tp5_marianorodriguezarce.Actividad_1.Ejercicio_10.Titular(
                "Maximiliano Rodríguez", "43555666");
        cuenta.setTitular(tit);
        System.out.println(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
    }

    public static void Ejercicio11() {
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Artista artista = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Artista(
                "The Weeknd", "Pop");
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Cancion cancion = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Cancion(
                "Blinding Lights", artista);
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Reproductor reproductor = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_11.Reproductor();

        reproductor.reproducir(cancion);
    }

    public static void Ejercicio12() {
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Contribuyente c = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Contribuyente(
                "Ana Pérez", "20-43523626-5");
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Impuesto imp = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Impuesto(
                10000.0, c);
        tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Calculadora calc = new tp5_marianorodriguezarce.Actividad_2.Ejercicio_12.Calculadora();

        calc.calcular(imp);
    }

    public static void Ejercicio13() {
        tp5_marianorodriguezarce.Actividad_3.Ejercicio_13.Usuario u = new tp5_marianorodriguezarce.Actividad_3.Ejercicio_13.Usuario(
                "Valentín", "valen@mail.com");
        tp5_marianorodriguezarce.Actividad_3.Ejercicio_13.GeneradorQR gen = new tp5_marianorodriguezarce.Actividad_3.Ejercicio_13.GeneradorQR();
        gen.generar("https://miapp.com/u/valen", u);
    }

    public static void Ejercicio14() {
        tp5_marianorodriguezarce.Actividad_3.Ejercicio_14.Proyecto proyecto = new tp5_marianorodriguezarce.Actividad_3.Ejercicio_14.Proyecto(
                "Video Promocional", 5);
        tp5_marianorodriguezarce.Actividad_3.Ejercicio_14.Render render = new tp5_marianorodriguezarce.Actividad_3.Ejercicio_14.Render(
                "MP4", proyecto);

        System.out.println("Render creado: " + render);
    }
}
