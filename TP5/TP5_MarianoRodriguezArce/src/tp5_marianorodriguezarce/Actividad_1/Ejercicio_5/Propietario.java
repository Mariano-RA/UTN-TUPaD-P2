package tp5_marianorodriguezarce.Actividad_1.Ejercicio_5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    void setComputadoraInternal(Computadora c) {
        this.computadora = c;
    }

    public void setComputadora(Computadora c) {
        if (this.computadora == c)
            return;
        if (this.computadora != null) {
            Computadora old = this.computadora;
            this.computadora = null;
            old.setPropietarioInternal(null);
        }
        this.computadora = c;
        if (c != null) {
            c.setPropietarioInternal(this);
        }
    }
}