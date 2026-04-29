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
}
