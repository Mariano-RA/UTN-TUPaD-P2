package tp5_marianorodriguezarce.Actividad_1.Ejercicio_7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    void setVehiculoInternal(Vehiculo v) {
        this.vehiculo = v;
    }

    public void setVehiculo(Vehiculo v) {
        if (this.vehiculo == v)
            return;
        if (this.vehiculo != null) {
            Vehiculo old = this.vehiculo;
            this.vehiculo = null;
            old.setConductorInternal(null);
        }
        this.vehiculo = v;
        if (v != null) {
            v.setConductorInternal(this);
        }
    }
}