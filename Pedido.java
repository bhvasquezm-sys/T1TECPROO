/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedido;

/**
 *
 * @author bhvas
 */
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private ArrayList<Plato> platos;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.platos = new ArrayList<>();
    }

    public Pedido(int idPedido, ArrayList<Plato> platos) {
        this.idPedido = idPedido;
        this.platos = platos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    // Buscar si un plato ya existe
    public Plato buscarPlato(String nombre) {
        for (Plato p : platos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void agregarPlato(String nombre, double precio, int cantidad) {
        platos.add(new Plato(nombre, precio, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        for (Plato p : platos) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }

    public void mostrarResumen() {
        if (platos.isEmpty()) {
            System.out.println("El pedido está vacío.");
            return;
        }
        System.out.println("Resumen del pedido:");
        for (Plato p : platos) {
            System.out.println("- " + p.getNombre() + " x" + p.getCantidad() + " (" + p.getPrecio() + " cada uno)");
        }
    }

    public boolean eliminarPlato(String nombre) {
        Plato p = buscarPlato(nombre);
        if (p != null) {
            platos.remove(p);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido(1);
        pedido.agregarPlato("Pizza", 10.5, 2);
        pedido.agregarPlato("Ensalada", 5.0, 1);
        pedido.agregarPlato("Refresco", 2.0, 3);

        pedido.mostrarResumen();
    }
}
