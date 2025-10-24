package tp5_marianorodriguezarce.Actividad_1.Ejercicio_7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // agregación
    private Conductor conductor; // bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    void setConductorInternal(Conductor c) {
        this.conductor = c;
    }

    public void setConductor(Conductor c) {
        if (this.conductor == c)
            return;
        if (this.conductor != null) {
            Conductor old = this.conductor;
            this.conductor = null;
            old.setVehiculoInternal(null);
        }
        this.conductor = c;
        if (c != null) {
            c.setVehiculoInternal(this);
        }
    }
}