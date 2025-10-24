package tp5_marianorodriguezarce.Actividad_1.Ejercicio_4;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void setTarjeta(TarjetaDeCredito t) {
        this.tarjeta = t;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}