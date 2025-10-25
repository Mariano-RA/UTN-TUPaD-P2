/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso3;

/**
 *
 * @author nanos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) { this.nombre = nombre; }

    public void agregarProfesor(Profesor p) {
        if (p == null) return;
        if (buscarProfesorPorId(p.getId()) != null) {
            System.out.println("Ya existe un profesor con ID " + p.getId());
            return;
        }
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (buscarCursoPorCodigo(c.getCodigo()) != null) {
            System.out.println("Ya existe un curso con código " + c.getCodigo());
            return;
        }
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (Objects.equals(p.getId(), id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (Objects.equals(c.getCodigo(), codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) {
            System.out.println("No se pudo asignar. Verifique curso/profesor.");
            return;
        }
        c.setProfesor(p);
        System.out.println("Asignado " + p.getNombre() + " al curso " + c.getCodigo());
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) { System.out.println("No hay profesores."); return; }
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) { System.out.println("No hay cursos."); return; }
        cursos.forEach(Curso::mostrarInfo);
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) {
            System.out.println("No existe el curso " + codigo);
            return;
        }
        
        if (c.getProfesor() != null) c.setProfesor(null);
        boolean removed = cursos.remove(c);
        System.out.println(removed ? "Curso " + codigo + " eliminado." : "No se pudo eliminar el curso " + codigo);
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) {
            System.out.println("No existe el profesor " + id);
            return;
        }
        
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        boolean removed = profesores.remove(p);
        System.out.println(removed ? "Profesor " + id + " eliminado." : "No se pudo eliminar el profesor " + id);
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("=== Reporte: Cantidad de cursos por profesor ===");
        if (profesores.isEmpty()) { System.out.println("(sin profesores)"); return; }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size());
        }
    }
}
