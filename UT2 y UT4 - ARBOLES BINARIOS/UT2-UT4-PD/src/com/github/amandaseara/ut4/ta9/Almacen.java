/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut4.ta9;

/**
 *
 * @author Amanda
 */
public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;
    private int valorStock;

    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        boolean insertar = this.productos.insertar(new TElementoAB<>(unProducto.getEtiqueta(), unProducto));
        if(insertar){
            this.valorStock += unProducto.getPrecio()*unProducto.getStock();
        }
    }

    @Override
    public String imprimirProductos() {
        return this.productos.inOrden();
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        TElementoAB<Producto> busqueda = this.productos.buscar(clave);
        if(busqueda != null) {
            Producto producto = busqueda.getDatos();
            producto.agergarStock(cantidad);
            this.valorStock += cantidad*producto.getPrecio();
            return true;
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        TElementoAB<Producto> busqueda = this.productos.buscar(clave);
        if(busqueda != null) {
            Producto producto = busqueda.getDatos();
            int stockRestante = producto.restarStock(cantidad);
            if(stockRestante > 0){
                this.valorStock -= cantidad * stockRestante;
            }
            return stockRestante;
        }
        return -1;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        TElementoAB<Producto> busqueda = this.productos.buscar(clave);
        if(busqueda != null) {
            return busqueda.getDatos();
        }
        return null;
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        TElementoAB<Producto> producto = this.productos.buscar(clave);
        boolean wasPresent = producto != null;
        if(wasPresent){
            this.productos.eliminar(clave);
            this.valorStock -= producto.getDatos().getStock()*producto.getDatos().getPrecio();
        }
        return wasPresent;
    }
    
    public int valorTotalStock(){
        return this.valorStock;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public TArbolBB<Producto> getProductos() {
        return productos;
    }

}
