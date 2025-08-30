/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_marianorodriguezarce;

/**
 *
 * @author nanos
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio < 2025) {
            anioPublicacion = anio;
        } else {
            System.out.println("Año inválido: " + anio);
        }
    }

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public void mostrarInfo() {
        System.out.println("\n=== Informacion del Libro ===");
        System.out.println("Titulo: '" + titulo + "'\nAutor: " + autor + "\naño: " + anioPublicacion);
    }
}
