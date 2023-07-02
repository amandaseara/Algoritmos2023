/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut9.ta9;

/**
 *
 * @author Amanda
 */
public class CalculoTiemposEjecucion {
    
    public static void main(String args[]) {
        int[] tamano = new int[]{300, 3000, 30000};
        String[] orden = new String[]{"ascendente", "descendente", "aleatorio"};
        String[] algoritmo = new String[]{"Heap", "Seleccion"};
        for (int a = 0; a <= algoritmo.length - 1; a++) {
            for (int b = 0; b <= orden.length - 1; b++) {
                for (int c = 0; c <= tamano.length - 1; c++) {
                    System.out.println(algoritmo[a] + ", " + orden[b] + ", " + tamano[c] + ": " + calcularTiempoAlgoritmo(tamano[c], orden[b], algoritmo[a])); //en nanosegundos, si se quiere mostrar en milisegundos hay que dividir el resultado de calcularTiempoAlgoritmo entre 1000000
                }
            }
        }
    }

    public static long calcularTiempoAlgoritmo(int t, String tipoOrden, String tipoAlgoritmo) {
        TClasificador clasif = new TClasificador();
        GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();

        int i = 0;
        switch (tipoAlgoritmo) {
            case "Insercion":
                i = 1;
                break;
            case "Shell":
                i = 2;
                break;
            case "Burbuja":
                i = 3;
                break;
            case "Heap":
                i = 4;
                break;
            case "QuickSort":
                i = 5;
                break;
            case "Seleccion":
                i = 6;
                break;
            default:
                System.out.println("Este codigo no deberia haberse ejecutado");
                break;
        }
        int[] vectorOriginal = gdg.generarDatos(t, tipoOrden);

        long tiempoResolucion = 1000000000;
        long t1 = System.nanoTime();
        long total = 0;
        int cantLlamadas = 0;
        while (total < tiempoResolucion) {
            cantLlamadas++;
            int[] datosCopia = vectorOriginal;
            clasif.clasificar(datosCopia, i, false);
            long t2 = System.nanoTime();
            total = t2 - t1;
        }

        long tiempoMedioAlgoritmoBase = total / cantLlamadas;

        vectorOriginal = gdg.generarDatos(t, tipoOrden);

        t1 = System.nanoTime();
        total = 0;
        cantLlamadas = 0;

        while (total < tiempoResolucion) {
            cantLlamadas++;
            int[] datosCopia = vectorOriginal;
            clasif.clasificar(datosCopia, i, true);
            long t2 = System.nanoTime();
            total = t2 - t1;
        }
        long tiempoMedioCascara = total / cantLlamadas;

        return tiempoMedioAlgoritmoBase - tiempoMedioCascara;
    }
    
}
