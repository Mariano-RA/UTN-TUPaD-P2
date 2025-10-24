package tp5_marianorodriguezarce.Actividad_3.Ejercicio_13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // creación interna
        // Ejemplo: "usar" el objeto sin guardarlo como atributo
        System.out.println("QR generado: " + qr);
    }
}