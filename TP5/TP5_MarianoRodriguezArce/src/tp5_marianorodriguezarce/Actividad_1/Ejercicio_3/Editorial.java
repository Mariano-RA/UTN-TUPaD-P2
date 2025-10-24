package tp5_marianorodriguezarce.Actividad_1.Ejercicio_3;

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + ", " + direccion;
    }
}