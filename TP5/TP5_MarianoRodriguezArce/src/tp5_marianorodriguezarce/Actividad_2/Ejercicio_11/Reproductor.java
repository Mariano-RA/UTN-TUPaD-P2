package tp5_marianorodriguezarce.Actividad_2.Ejercicio_11;

public class Reproductor {

    public void reproducir(Cancion cancion) { // dependencia de uso
        System.out.println("🎧 Reproduciendo: " + cancion.getTitulo() +
                " | Artista: " + cancion.getArtista().getNombre());
    }
}