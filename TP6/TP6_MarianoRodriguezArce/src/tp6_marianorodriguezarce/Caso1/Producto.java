/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso1;

import Caso1.CategoriaProducto;

/**
 *
 * @author nanos
 */
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID no puede ser vacío");
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.printf("Producto{id=%s, nombre=%s, precio=%.2f, cantidad=%d, categoria=%s}%n",
                id, nombre, precio, cantidad, categoria);
    }

    @Override
    public String toString() {
        return "Producto{"
                + "id='" + id + '\''
                + ", nombre='" + nombre + '\''
                + ", precio=" + String.format("%.2f", precio)
                + ", cantidad=" + cantidad
                + ", categoria=" + categoria
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Producto)) {
            return false;
        }
        return id.equals(((Producto) o).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
