package tp5_marianorodriguezarce.Actividad_1.Ejercicio_10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // bidireccional

    public Titular(String nombre, String dni) {
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

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    void setCuentaInternal(CuentaBancaria c) {
        this.cuenta = c;
    }

    public void setCuenta(CuentaBancaria c) {
        if (this.cuenta == c)
            return;
        if (this.cuenta != null) {
            CuentaBancaria old = this.cuenta;
            this.cuenta = null;
            old.setTitularInternal(null);
        }
        this.cuenta = c;
        if (c != null) {
            c.setTitularInternal(this);
        }
    }
}