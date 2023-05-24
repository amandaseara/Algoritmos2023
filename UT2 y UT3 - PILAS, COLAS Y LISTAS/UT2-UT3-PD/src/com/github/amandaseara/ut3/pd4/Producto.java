/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd4;

/**
 *
 * @author Amanda
 */
public class Producto implements IProducto {
    
    private Comparable codProducto;
    private Integer precio;
    private Integer stock;
    private String nombre;
    private String descripcion;

    public Producto(Comparable codProducto, Integer precio, Integer stock, String nombre, String descripcion){
        this.codProducto = codProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public Comparable getCodProducto() {
        return this.codProducto;
    }

    @Override
    public Integer getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        this.stock += stock;
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        this.stock -= stock;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
