/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

/**
 *
 * @author nanos
 */
import Caso1.CategoriaProducto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventario {

    private final ArrayList<Producto> productos = new ArrayList<>();
    
    public Producto buscarProductoPorId(String id) {
        if (id == null) {
            return null;
        }
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean agregarProducto(Producto p) {
        if (p == null) {
            return false;
        }
        if (buscarProductoPorId(p.getId()) != null) {
            return false;
        }
        return productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El Inventario esta vacío.");
            return;
        }
        productos.forEach(Producto::mostrarInfo);
    }    

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        return p != null && productos.remove(p);
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p == null) {
            return false;
        }
        p.setCantidad(nuevaCantidad);
        return true;
    }

    // --- Filtros ---
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Optional<Producto> max = productos.stream()
            .max(Comparator.comparingInt(Producto::getCantidad));
        return max.orElse(null);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        return productos.stream()
            .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
            .collect(Collectors.toList());
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " -> " + c.getDescripcion());
        }
    }

}
