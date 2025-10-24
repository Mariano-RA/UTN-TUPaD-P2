package tp5_marianorodriguezarce.Actividad_2.Ejercicio_12;

public class Calculadora {

    public void calcular(Impuesto impuesto) { // dependencia de uso
        double total = impuesto.getMonto() * 1.21; // ejemplo: aplica IVA 21%
        System.out.println("💰 Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("Monto total (IVA 21%): $" + total);
    }
}