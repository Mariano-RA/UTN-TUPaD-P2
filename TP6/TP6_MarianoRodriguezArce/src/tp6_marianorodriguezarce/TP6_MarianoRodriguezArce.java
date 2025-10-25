/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_marianorodriguezarce;

import Caso1.CategoriaProducto;
import Caso1.Producto;
import Caso1.Inventario;
import Caso2.Autor;
import Caso2.Biblioteca;
import Caso3.Curso;
import Caso3.Profesor;
import Caso3.Universidad;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nanos
 */
public class TP6_MarianoRodriguezArce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=============================");
            System.out.println("   TRABAJO PRÁCTICO 6 ");
            System.out.println("=============================");
            System.out.println("1 - Sistema de Stock");
            System.out.println("2 - Biblioteca y Libros");
            System.out.println("3 - Universidad y Cursos");
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    ejecutarStock();
                case 2 ->
                    ejecutarBiblioteca();
                case 3 ->
                    ejecutarUniversidad();
                case 0 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // =================== EJERCICIO 1 ===================
    private static void ejecutarStock() {
        System.out.println("\n=== SISTEMA DE STOCK ===");
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("P1", "Leche", 1500, 10, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P2", "TV Samsung", 250000, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P3", "Remera", 2500, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P4", "Licuadora", 20000, 8, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P5", "Arroz", 1800, 50, CategoriaProducto.ALIMENTOS));

        System.out.println("\n--- Listado completo ---");
        inv.listarProductos();

        System.out.println("\n--- Buscar producto P3 ---");
        inv.buscarProductoPorId("P3").mostrarInfo();

        System.out.println("\n--- Filtrar por categoría ALIMENTOS ---");
        List<Producto> listadoFiltrado = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        listadoFiltrado.forEach(Producto::mostrarInfo);

        System.out.println("\n--- Eliminar producto P2 ---");
        inv.eliminarProducto("P2");
        inv.listarProductos();

        System.out.println("\n--- Actualizar stock de P1 ---");
        inv.actualizarStock("P1", 20);
        inv.buscarProductoPorId("P1").mostrarInfo();

        System.out.println("\nTotal de stock: " + inv.obtenerTotalStock());
        System.out.println("\nProducto con mayor stock: " + inv.obtenerProductoConMayorStock());
        System.out.println("\nProductos entre $1000 y $3000:");
        
        List<Producto> listadoFiltradoPorPrecio = inv.filtrarProductosPorPrecio(1000, 3000);
        listadoFiltradoPorPrecio.forEach(Producto::mostrarInfo);
        
        System.out.println("\nCategorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }

    // =================== EJERCICIO 2 ===================
    private static void ejecutarBiblioteca() {
        System.out.println("\n=== SISTEMA DE BIBLIOTECA ===");
        Biblioteca b = new Biblioteca("Biblioteca UTN");

        Autor a1 = new Autor("A1", "Julio Cortázar", "Argentina");
        Autor a2 = new Autor("A2", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A3", "Haruki Murakami", "Japón");

        b.agregarLibro("ISBN-001", "Rayuela", 1963, a1);
        b.agregarLibro("ISBN-002", "Bestiario", 1951, a1);
        b.agregarLibro("ISBN-003", "La casa de los espíritus", 1982, a2);
        b.agregarLibro("ISBN-004", "Kafka en la orilla", 2002, a3);
        b.agregarLibro("ISBN-005", "Tokio Blues", 1987, a3);

        System.out.println("\n--- Listar todos los libros ---");
        b.listarLibros();

        System.out.println("\n--- Buscar libro ISBN-004 ---");
        b.buscarLibroPorIsbn("ISBN-004").mostrarInfo();

        System.out.println("\n--- Filtrar libros por año 1987 ---");
        b.filtrarLibrosPorAnio(1987);

        System.out.println("\n--- Eliminar libro ISBN-002 ---");
        b.eliminarLibro("ISBN-002");
        b.listarLibros();

        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());
        System.out.println("\n--- Autores disponibles ---");
        b.mostrarAutoresDisponibles();
    }

    // =================== EJERCICIO 3 ===================
    private static void ejecutarUniversidad() {
        System.out.println("\n=== SISTEMA UNIVERSIDAD ===");
        Universidad u = new Universidad("UTN");

        Profesor pr1 = new Profesor("P1", "Ana García", "Bases de Datos");
        Profesor pr2 = new Profesor("P2", "Luis Pérez", "POO");
        Profesor pr3 = new Profesor("P3", "Mariana López", "Redes");

        Curso cu1 = new Curso("BD101", "Introducción a BD");
        Curso cu2 = new Curso("POO201", "Programación Orientada a Objetos");
        Curso cu3 = new Curso("RD301", "Redes I");
        Curso cu4 = new Curso("WEB150", "Desarrollo Web");
        Curso cu5 = new Curso("ALG120", "Algoritmos I");

        u.agregarProfesor(pr1);
        u.agregarProfesor(pr2);
        u.agregarProfesor(pr3);

        u.agregarCurso(cu1);
        u.agregarCurso(cu2);
        u.agregarCurso(cu3);
        u.agregarCurso(cu4);
        u.agregarCurso(cu5);

        u.asignarProfesorACurso("BD101", "P1");
        u.asignarProfesorACurso("POO201", "P2");
        u.asignarProfesorACurso("RD301", "P3");
        u.asignarProfesorACurso("WEB150", "P2");
        u.asignarProfesorACurso("ALG120", "P1");

        System.out.println("\n--- Listado de cursos ---");
        u.listarCursos();
        System.out.println("\n--- Profesores ---");
        u.listarProfesores();

        System.out.println("\n--- Reasignar WEB150 a P3 ---");
        u.asignarProfesorACurso("WEB150", "P3");
        u.listarCursos();

        System.out.println("\n--- Eliminar curso POO201 ---");
        u.eliminarCurso("POO201");
        u.listarCursos();

        System.out.println("\n--- Eliminar profesor P1 ---");
        u.eliminarProfesor("P1");
        u.listarCursos();

        System.out.println();
        u.reporteCantidadCursosPorProfesor();
    }
}
