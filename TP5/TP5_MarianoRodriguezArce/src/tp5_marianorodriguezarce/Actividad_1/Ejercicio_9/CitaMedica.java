package tp5_marianorodriguezarce.Actividad_1.Ejercicio_9;

import java.time.LocalDate;

public class CitaMedica {
    private LocalDate fecha;
    private String hora; // "HH:mm"
    private Paciente paciente; // unidireccional
    private Profesional profesional; // unidireccional

    public CitaMedica(LocalDate fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
}