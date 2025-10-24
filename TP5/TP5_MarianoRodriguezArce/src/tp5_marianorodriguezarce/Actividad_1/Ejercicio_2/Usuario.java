package tp5_marianorodriguezarce.Actividad_1.Ejercicio_2;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setCelular(Celular c) {
        this.celular = c;
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}