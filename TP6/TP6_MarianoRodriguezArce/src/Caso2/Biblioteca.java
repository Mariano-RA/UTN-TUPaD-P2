/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso2;

/**
 *
 * @author nanos
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("Ya existe un libro con ISBN: " + isbn);
            return;
        }
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        libros.forEach(Libro::mostrarInfo);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        boolean removed = libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
        System.out.println(removed ? "Libro " + isbn + " eliminado." : "No se encontró el ISBN " + isbn + ".");
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        libros.stream()
              .filter(l -> l.getAnioPublicacion() == anio)
              .forEach(Libro::mostrarInfo);
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new LinkedHashSet<>();
        for (Libro l : libros) {
            if (l.getAutor() != null) autores.add(l.getAutor());
        }
        if (autores.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }
        autores.forEach(Autor::mostrarInfo);
    }
}

