package tp5_marianorodriguezarce.Actividad_1.Ejercicio_4;

public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return nombre + " (CUIT " + cuit + ")";
    }
}