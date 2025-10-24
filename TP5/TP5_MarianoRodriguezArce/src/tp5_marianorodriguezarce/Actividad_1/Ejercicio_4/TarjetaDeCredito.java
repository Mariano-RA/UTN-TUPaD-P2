package tp5_marianorodriguezarce.Actividad_1.Ejercicio_4;

import java.time.YearMonth;

public class TarjetaDeCredito {
    private String numero;
    private YearMonth fechaVencimiento;
    private Cliente cliente; // bidireccional
    private Banco banco; // agregación

    public TarjetaDeCredito(String numero, YearMonth fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        if (cliente != null)
            cliente.setTarjeta(this);
    }

    @Override
    public String toString() {
        return "Tarjeta " + numero + " de " + cliente + " - Banco " + banco;
    }
}