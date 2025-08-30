/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class TP3_MarianoRodriguezArce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== 1) Registro de Estudiantes ==========");
        Estudiante e = new Estudiante("Mariano", "Rodríguez", "Programacion II", 9);
        e.mostrarInfo();
        e.subirCalificacion(1);
        e.mostrarInfo();
        e.bajarCalificacion(2);
        e.mostrarInfo();

        System.out.println("\n========== 2) Registro de Mascotas ==========");
        Mascota m = new Mascota("Pili", "Gata", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.cumplirAnios();
        m.mostrarInfo();

        System.out.println("\n========== 3) Encapsulamiento con Libro ==========");
        Libro lib = new Libro("Introducción a Java", "UTN - TUP", 2022);
        lib.mostrarInfo();
        // Modifico por un año invalido
        lib.setAnioPublicacion(-1200);
        lib.mostrarInfo();
        // Modifico por un año valido
        lib.setAnioPublicacion(2024);
        lib.mostrarInfo();

        System.out.println("\n========== 4) Gestión de Gallinas ==========");
        Gallina g1 = new Gallina(1, 10);
        Gallina g2 = new Gallina(2, 8);

        System.out.println("\n === Datos Cargados ===");
        g1.mostrarEstado();
        g2.mostrarEstado();

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();

        System.out.println("\n === Datos Finales ===");
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\n========== 5) Simulación de Nave Espacial ==========");
        NaveEspacial n = new NaveEspacial("Andrómeda", 50, 100);
        n.mostrarEstado();
        n.despegar();
        // Avanzo una distancia mayor a la cantidad de combustible
        n.avanzar(60);
        n.recargarCombustible(30);
        n.avanzar(60);
        n.mostrarEstado();
    }

}
