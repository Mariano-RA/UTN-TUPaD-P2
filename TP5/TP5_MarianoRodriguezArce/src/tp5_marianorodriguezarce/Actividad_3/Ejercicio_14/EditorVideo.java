package tp5_marianorodriguezarce.Actividad_3.Ejercicio_14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); // creación interna
        // Ejemplo de uso sin guardar estado
        System.out.println("Export listo: " + render);
    }
}
