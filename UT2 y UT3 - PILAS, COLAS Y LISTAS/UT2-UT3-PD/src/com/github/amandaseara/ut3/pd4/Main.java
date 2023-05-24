/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.amandaseara.ut3.pd4;

/**
 *
 * @author Amanda
 */
public class Main {
    
    private static long comprar(String rutaArchivo, Almacen almacen){
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(rutaArchivo);

        for (int i = 1; i<lineas.length; i++) {
            String[] partes = lineas[i].split(",");

            String codProducto = partes[0];
            String nombre = partes[1];
            int cantidad = Integer.parseInt(partes[2]);
            int precio = Integer.parseInt(partes[3]);
            
            if(almacen.buscarPorCodigo(codProducto)!=null) {
                almacen.agregarStock(codProducto, cantidad);
            } else{
                almacen.insertarProducto(new Producto(codProducto,precio,cantidad,nombre,nombre));
            }
        }

        return almacen.obtenerValorStock();
    }
    
    private static long vender(String rutaArchivo, Almacen almacen) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(rutaArchivo);
        
        long valorStockInicial = almacen.obtenerValorStock();

        for (int i = 1; i<lineas.length; i++) {
            String[] partes = lineas[i].split(",");

            String codProducto = partes[0];
            int cantidad = Integer.parseInt(partes[1]);

            almacen.restarStock(codProducto, cantidad);
        }

        return valorStockInicial - almacen.obtenerValorStock();
    }
    
    public static void main(String[] args){
        
        Almacen almacen = new Almacen("G.E.AN.T", "PARQUE ROOSEVELT AV GIANNATTASIO Y AV A LA PLAYA", "0800 5020");
        
        System.out.println("Valor de stock luego de comprar: "+comprar("src/com/github/amandaseara/ut3/pd4/Altas.txt", almacen));
        
        System.out.println("Valor de stock luego de vender: "+vender("src/com/github/amandaseara/ut3/pd4/Ventas.txt", almacen));
    }
    
}
