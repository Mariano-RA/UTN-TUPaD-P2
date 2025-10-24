package tp5_marianorodriguezarce.Actividad_2.Ejercicio_11;

public class Cancion {
    private String titulo;
    private Artista artista; // asociación unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" - " + artista;
    }
}