package tp5_marianorodriguezarce.Actividad_1.Ejercicio_6;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private String hora; // simplificado: "HH:mm"
    private Cliente  cliente; // unidireccional
    private Mesa mesa; // agregación

    public Reserva(LocalDate fecha, String hora, Cliente  cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente  getCliente() {
        return cliente;
    }

    public void setCliente(Cliente  cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}