/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd4;

/**
 *
 * @author Amanda
 */
public class Almacen implements IAlmacen {
    
    private String direccion;
    private String telefono;
    private String nombre;
    private Lista<Producto> productos;

    public Almacen(String direccion, String telefono, String nombre){
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.productos = new Lista<>();
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Lista<Producto> getListaProductos() {
        return productos;
    }

    @Override
    public long obtenerValorStock() {
        long total = 0;
        for (Nodo<Producto> nodo = productos.getPrimero(); nodo != null; nodo = nodo.getSiguiente()) {
            Producto producto = nodo.getDato();
            total += producto.getStock() * producto.getPrecio();
        }
        return total;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        this.productos.insertar(new Nodo<>(unProducto.getCodProducto(), unProducto));
    }

    @Override
    public boolean eliminarProducto(Comparable codProducto) {
        return this.productos.eliminar(codProducto);
    }

    @Override
    public String imprimirProductos() {
        return this.productos.imprimir();
    }

    @Override
    public String imprimirSeparador(String separador) {
        return this.productos.imprimir(separador);
    }

    @Override
    public Boolean agregarStock(Comparable codProducto, Integer cantidad) {
        Producto producto = buscarPorCodigo(codProducto);
        if(producto != null){
            producto.agregarCantidadStock(cantidad);
        }
        return producto != null;
    }

    @Override
    public Integer restarStock(Comparable codProducto, Integer cantidad) {
        Producto producto = buscarPorCodigo(codProducto);
        if (producto != null) {
            producto.restarCantidadStock(cantidad);
            return producto.getStock();
        }
        return 0;
    }

    @Override
    public Producto buscarPorCodigo(Comparable codProducto) {
        Nodo<Producto> producto = this.productos.buscar(codProducto);
        if (producto != null) {
            return producto.getDato();
        }
        return null;
    }

    @Override
    public void listarOrdenadoPorNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantidadProductos() {
        return this.productos.cantElementos();
    }
    
}
