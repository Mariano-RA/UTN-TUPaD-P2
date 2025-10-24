/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_marianorodriguezarce.Actividad_1.Ejercicio_1;

import java.time.LocalDate;

/**
 *
 * @author nanos
 */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto; // composici�n
    private Titular titular; // asociaci�n bidireccional

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Composici�n: la Foto "vive" dentro del Pasaporte
        this.foto = foto;
        // Asociaci�n bidireccional: sincronizamos ambos lados
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte();
        }
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + numero + ", titular=" + titular + '}';
    }
}