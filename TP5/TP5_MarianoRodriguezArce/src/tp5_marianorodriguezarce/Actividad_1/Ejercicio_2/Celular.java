package tp5_marianorodriguezarce.Actividad_1.Ejercicio_2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación
    private Usuario usuario; // bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        if (usuario != null)
            usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " [" + bateria + "] de " + usuario;
    }
}