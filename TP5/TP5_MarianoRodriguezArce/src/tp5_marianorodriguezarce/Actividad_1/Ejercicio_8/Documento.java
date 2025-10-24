package tp5_marianorodriguezarce.Actividad_1.Ejercicio_8;

public class Documento {
    private String titulo;
    private String contenido;
    // Composición: Documento -> FirmaDigital
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        if (firmaDigital == null)
            throw new IllegalArgumentException("FirmaDigital no puede ser null (composición).");
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        if (firmaDigital == null)
            throw new IllegalArgumentException("FirmaDigital no puede ser null (composición).");
        this.firmaDigital = firmaDigital;
    }
}