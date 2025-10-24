package tp5_marianorodriguezarce.Actividad_1.Ejercicio_10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // composición
    private Titular titular; // bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad) {
        if (claveSeguridad == null)
            throw new IllegalArgumentException("ClaveSeguridad no puede ser null (composición).");
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        if (claveSeguridad == null)
            throw new IllegalArgumentException("ClaveSeguridad no puede ser null (composición).");
        this.claveSeguridad = claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    void setTitularInternal(Titular t) {
        this.titular = t;
    }

    public void setTitular(Titular t) {
        if (this.titular == t)
            return;
        if (this.titular != null) {
            Titular old = this.titular;
            this.titular = null;
            old.setCuentaInternal(null);
        }
        this.titular = t;
        if (t != null) {
            t.setCuentaInternal(this);
        }
    }
}