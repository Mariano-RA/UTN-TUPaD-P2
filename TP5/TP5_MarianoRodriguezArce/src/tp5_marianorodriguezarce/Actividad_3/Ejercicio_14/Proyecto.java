package tp5_marianorodriguezarce.Actividad_3.Ejercicio_14;

public class Proyecto {
    private String nombre;
    private int duracionMin; // duración en minutos

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre='" + nombre + "', duracionMin=" + duracionMin + "}";
    }
}