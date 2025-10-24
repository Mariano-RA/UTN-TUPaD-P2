package tp5_marianorodriguezarce.Actividad_1.Ejercicio_3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // asociación unidireccional
    private Editorial editorial; // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return '"' + titulo + '"' + " (" + isbn + ") de " + autor + ", " + editorial;
    }
}