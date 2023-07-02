/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amandaseara.github.ut9.ta9;

import java.util.Random;

/**
 *
 * @author Amanda
 */
public class TClasificador {

    public static final int METODO_CLASIFICACION_INSERCION = 1;
    public static final int METODO_CLASIFICACION_SHELL = 2;
    public static final int METODO_CLASIFICACION_BURBUJA = 3;
    public static final int METODO_CLASIFICACION_QUICKSORT = 4;
    public static final int METODO_CLASIFICACION_HEAP = 5; //AL REVES
    public static final int METODO_CLASIFICACION_SELECCION = 6;
    public static final int METODO_CLASIFICACION_BUCKETSORT = 7; //NO ANDA
    public static final int METODO_CLASIFICACION_CUENTA_DISTRIBUCION = 8; //NO ANDA

    /**
     * Punto de entrada al clasificador
     *
     * @param metodoClasificacion
     * @param orden
     * @param tamanioVector
     * @return Un vector del tam. solicitado, ordenado por el algoritmo
     * solicitado
     */
    public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion, boolean cascara) {
        switch (metodoClasificacion) {
            case METODO_CLASIFICACION_INSERCION:
                if (cascara) {
                    return ordenarPorInsercionCascara(datosParaClasificar);
                } else {
                    return ordenarPorInsercion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_SHELL:
                if (cascara) {
                    return ordenarPorShellCascara(datosParaClasificar);
                } else {
                    return ordenarPorShell(datosParaClasificar);
                }
            case METODO_CLASIFICACION_BURBUJA:
                if (cascara) {
                    return ordenarPorBurbujaCascara(datosParaClasificar);
                } else {
                    return ordenarPorBurbuja(datosParaClasificar);
                }
            case METODO_CLASIFICACION_QUICKSORT:
                if (cascara) {
                    return ordenarPorQuickSortCascara(datosParaClasificar);
                } else {
                    return ordenarPorQuickSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_HEAP:
                if (cascara) {
                    return ordenarPorHeapSortCascara(datosParaClasificar);
                } else {
                    return ordenarPorHeapSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_SELECCION:
                if (cascara) {
                    return ordenarPorSeleccionCascara(datosParaClasificar);
                } else {
                    return ordenarPorSeleccion(datosParaClasificar);
                }
            case METODO_CLASIFICACION_BUCKETSORT:
                if (cascara) {
                    return ordenarPorBucketsortCascara(datosParaClasificar);
                } else {
                    return ordenarPorBucketSort(datosParaClasificar);
                }
            case METODO_CLASIFICACION_CUENTA_DISTRIBUCION:
                if (cascara) {
                    return ordenarPorCuentaDistribucionCascara(datosParaClasificar);
                } else {
                    return ordenarPorCuentaDistribucion(datosParaClasificar);
                }
            default:
                System.err.println("Este codigo no deberia haberse ejecutado");
                break;
        }
        return datosParaClasificar;
    }

    private void intercambiar(int[] vector, int pos1, int pos2) {
        int temp = vector[pos2];
        vector[pos2] = vector[pos1];
        vector[pos1] = temp;
    }

    /**
     * @param datosParaClasificar
     * @return
     */
    private int[] ordenarPorShell(int[] datosParaClasificar) {
        int j, inc;
        int[] incrementos = new int[]{3223, 358, 51, 10, 3, 1};

        for (int posIncrementoActual = 0; posIncrementoActual < incrementos.length; posIncrementoActual++) {
            inc = incrementos[posIncrementoActual];
            if (inc < (datosParaClasificar.length / 2)) {
                for (int i = inc; i < datosParaClasificar.length; i++) {
                    j = i - inc;
                    while (j >= 0) {
                        if (datosParaClasificar[j] > datosParaClasificar[j + inc]) {
                            intercambiar(datosParaClasificar, j, j + inc);
                        }
                        j -= inc;
                    }
                }
            }
        }
        return datosParaClasificar;
    }
    
    protected int[] ordenarPorShellCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }

    /**
     * @param datosParaClasificar
     * @return
     */
    protected int[] ordenarPorInsercion(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            for (int i = 1; i < datosParaClasificar.length; i++) {
                int j = i - 1;
                while ((j >= 0) && (datosParaClasificar[j + 1] < datosParaClasificar[j])) {
                    intercambiar(datosParaClasificar, j + 1, j);
                    j--;
                }
            }
            return datosParaClasificar;
        }
        return null;
    }
    
    protected int[] ordenarPorInsercionCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }

    private int[] ordenarPorBurbuja(int[] datosParaClasificar) {
        int n = datosParaClasificar.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= (i + 1); j--) {
                if (datosParaClasificar[j] < datosParaClasificar[j - 1]) {
                    intercambiar(datosParaClasificar, j - 1, j);
                }
            }
        }
        return datosParaClasificar;
    }
    
    protected int[] ordenarPorBurbujaCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }
    
    protected int[] ordenarPorQuickSort(int[] datosParaClasificar) {
        int altura = quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1);
        return datosParaClasificar;
    }
    
    private int quicksort(int[] entrada, int i, int j) {
        int izquierda = i;
        int derecha = j;

        int posicionPivote = encuentraPivoteElementoCentral(izquierda, derecha);
        if (posicionPivote >= 0) {
            // El pivote es el elemento de la entrada cuyo índice es "posicionPivote".
            int pivote = entrada[posicionPivote];
            while (izquierda <= derecha) {
                while ((entrada[izquierda] < pivote) && (izquierda < j)) {
                    // L debe moverse a la derecha.
                    izquierda++;
                }

                while ((pivote < entrada[derecha]) && (derecha > i)) {
                    // R debe moverse a la izquierda.
                    derecha--;
                }

                if (izquierda <= derecha) {
                    intercambiar(entrada, derecha, izquierda);
                    izquierda++;
                    derecha--;
                }
            }

            int maxAltura = 0;

            // Un tercer error relacionado con las llamadas recursivas,
            // respecto a los límites de los subarreglos.
            if (i < derecha) {
                // derecha es el fin del subvector izquierdo.
                int alturaIzquierda = quicksort(entrada, i, derecha);
                if (maxAltura < alturaIzquierda) {
                    maxAltura = alturaIzquierda;
                }
            }
            if (izquierda < j) {
                // izquierda es el fin del subvector derecho.
                int alturaDerecha = quicksort(entrada, izquierda, j);
                if (maxAltura < alturaDerecha) {
                    maxAltura = alturaDerecha;
                }
            }

            return maxAltura + 1;
        }
        return 0;
    }
    
    protected int[] ordenarPorQuickSortCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }

    private int encuentraPivoteElementoCentral(int i, int j) {
        return (int) ((j - i - 1) /2)+i;
    }
    
    private int encuentraPivoteRandom(int i, int j, int[] entrada, int seed) {
        Random ran = new Random();
        ran.setSeed(seed);
        return ran.nextInt(i, j);
    }
    
    private int encuentraPivoteMedio(int i, int j, int[] arreglo){
        if (i-j>1){
            int numIzq = arreglo[i];
            int numDer = arreglo[j];
            int numMed = arreglo[j/2];
            if (numIzq<numDer){
                if(numIzq<numMed)
                    return numIzq;
                else
                    return numMed;
            }else{
                if(numDer<numMed)
                    return numDer;
                else
                    return numMed;
            }
        } else {
            return arreglo[i];
        }
    } 
    
    protected int[] ordenarPorHeapSort(int[] datosParaClasificar) {
        if (datosParaClasificar.length == 1)
            return datosParaClasificar;
        for (int i = (datosParaClasificar.length - 1) / 2; i >= 0; i--) { //Armo el heap inicial de n-1 div 2 hasta 0
            armaHeap(datosParaClasificar, i, datosParaClasificar.length - 1);
        }
        for (int i = datosParaClasificar.length - 1; i > 1; i--) {
            intercambiar(datosParaClasificar, 0, i);
            armaHeap(datosParaClasificar, 0, i-1);
        }
        if (datosParaClasificar.length != 2)
            intercambiar(datosParaClasificar, 0, 1);
        return datosParaClasificar;
    }
    private void armaHeap(int[] datosParaClasificar, int primero, int ultimo) {
        if (primero < ultimo) {
            int actual = primero;
            while (actual <= ultimo / 2) {
                if (ultimo == 2 * actual) { //r tiene un hijo solo
                    if (datosParaClasificar[actual] > datosParaClasificar[actual * 2]){
                        intercambiar(datosParaClasificar, actual, 2 * actual);
                    } else {
                        actual = ultimo;
                    }
                } else { //r tiene 2 hijos
                    int menor;
                    if (datosParaClasificar[2 * actual] > datosParaClasificar[2 * actual + 1]){
                        menor = 2 * actual + 1;
                    } else {
                        menor = 2 * actual;
                    }
                    if (datosParaClasificar[actual] > datosParaClasificar[menor]){
                        intercambiar(datosParaClasificar, actual, menor);
                        actual = menor;
                    } else {
                        actual = ultimo;
                    }
                }
            }
        }
    }
    
    protected int[] ordenarPorHeapSortCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }
    
    public int[] ordenarPorSeleccion(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            for (int i = 0; i <= datosParaClasificar.length - 1; i++) {
                int indiceDelMenor = i;
                int claveMenor = datosParaClasificar[i];
                for (int j = i + 1; j < datosParaClasificar.length; j++) {
                    if (datosParaClasificar[j] < claveMenor) {
                        indiceDelMenor = j;
                        claveMenor = datosParaClasificar[j];
                    }
                }
                intercambiar(datosParaClasificar, i, indiceDelMenor);
            }
        }
        return datosParaClasificar;
    }
    
    protected int[] ordenarPorSeleccionCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }
    
    protected int[] ordenarPorBucketSort(int[] datosParaClasificar) {
        bucketSort(datosParaClasificar);
        return datosParaClasificar;
    }
    protected void bucketSort(int[] datosParaClasificar) {
        int[][] bucket = new int[5][datosParaClasificar.length];
        // relleno array con -1 para identificar si el elemento era para ordenar o no
        int r = 0; int t = 0; while (r != 5) { while (t != datosParaClasificar.length) { bucket[r][t] = -1; t++; } t=0; r++; }
        int indice1 = 0;
        int indice2 = 0;
        int indice3 = 0;
        int indice4 = 0;
        int indice5 = 0;
        for (int k : datosParaClasificar) {
            if(k < 11) {
                bucket[0][indice1] = k;
                indice1++;
            } else if(k < 101) {
                bucket[1][indice2] = k;
                indice2++;
            } else if(k < 251) {
                bucket[2][indice3] = k;
                indice3++;
            } else if(k < 501) {
                bucket[3][indice4] = k;
                indice4++;
            } else {
                bucket[4][indice5] = k;
                indice5++;
            }
        }
        indice1 = 0;
        for (int i = 0; i < 5; i++) {
            clasificar(bucket[i], METODO_CLASIFICACION_INSERCION, true);
            for (int j = 0; j < bucket[i].length; j++) {
                if (bucket[i][j] != -1) {
                    datosParaClasificar[indice1] = bucket[i][j];
                    indice1++;
                }
            }
        }
    }
    
    protected int[] ordenarPorBucketsortCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }
    
    protected int[] ordenarPorCuentaDistribucion(int[] datosParaClasificar) {
        int menor = datosParaClasificar[0];
        int mayor = datosParaClasificar[0];
        int i = 1;
        while (i != datosParaClasificar.length) {
            if (datosParaClasificar[i] <= menor) {
                menor = datosParaClasificar[i];
            }
            if (datosParaClasificar[i] >= mayor) {
                mayor = datosParaClasificar[i];
            }
            i++;
        }
        cuentaDistribucion(datosParaClasificar, menor, mayor);
        return datosParaClasificar;
    }

    protected void cuentaDistribucion(int[] datosParaClasificar, int u, int v) {
        int[] cuenta = new int[v+1];
        for (int i = u; i < v+1; i++) {
            cuenta[i] = 0;
        }
        for (int k : datosParaClasificar) {
            cuenta[k]++;
        }
        for (int i = u+1; i <= v; i++) {
            cuenta[i] = cuenta[i] + cuenta[i - 1];
        }
        for (int i = u; i <= v; i++) {
            cuenta[i]--;
        }
        int i = 0;
        int[] s = new int[datosParaClasificar.length];
        for (int j = datosParaClasificar.length-1; j >= 0; j--) {
            i = cuenta[datosParaClasificar[j]];
            s[i] = datosParaClasificar[j];
            cuenta[datosParaClasificar[j]] = i-1;
        }
    }
    
    protected int[] ordenarPorCuentaDistribucionCascara(int[] datosParaClasificar) {
        if (datosParaClasificar != null) {
            return datosParaClasificar;
        }
        return null;
    }
    
    public boolean estaOrdenado(int[] datosClasificados, boolean ordenDescendente) {
        int i = 0;
        if (ordenDescendente) {
            while (i < datosClasificados.length - 1){
                if (datosClasificados[i] > datosClasificados[i + 1]) {
                    i++;
                }
                else return false;
            }
        } else {
            while (i < datosClasificados.length - 1) {
                if (datosClasificados[i] < datosClasificados[i + 1]) {
                    i++;
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        
        TClasificador clasif = new TClasificador();
        GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();
        //int[] vectorAleatorio = gdg.generarDatosAleatorios();
        //int[] vectorAscendente = gdg.generarDatosAscendentes();
        //int[] vectorDescendente = gdg.generarDatosDescendentes();

        int[] vectorAleatorio1 = gdg.generarDatosAleatorios();
        int[] resInsercion = clasif.clasificar(vectorAleatorio1,
                METODO_CLASIFICACION_INSERCION, false);
        for (int i = 0; i < resInsercion.length; i++) {
            System.out.print(resInsercion[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con insercion = " + clasif.estaOrdenado(resInsercion,false));
        
        int[] vectorAleatorio2 = gdg.generarDatosAleatorios();
        int[] resShell = clasif.clasificar(vectorAleatorio2,
                METODO_CLASIFICACION_SHELL, false);
        for (int i = 0; i < resShell.length; i++) {
            System.out.print(resShell[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con shellsort = " + clasif.estaOrdenado(resShell,false));
        
        int[] vectorAleatorio3 = gdg.generarDatosAleatorios();
        int[] resBurbuja = clasif.clasificar(vectorAleatorio3,
                METODO_CLASIFICACION_BURBUJA, false);
        for (int i = 0; i < resBurbuja.length; i++) {
            System.out.print(resBurbuja[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con burbuja = " + clasif.estaOrdenado(resBurbuja,false));
        
        int[] vectorAleatorio4 = gdg.generarDatosAleatorios();
        int[] resQuicksort = clasif.clasificar(vectorAleatorio4,
                METODO_CLASIFICACION_QUICKSORT, false);
        for (int i = 0; i < resQuicksort.length; i++) {
            System.out.print(resQuicksort[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con quicksort = " + clasif.estaOrdenado(resQuicksort,false));
        
        int[] vectorAleatorio5 = gdg.generarDatosAleatorios();
        int[] resHeapsort = clasif.clasificar(vectorAleatorio5,
                METODO_CLASIFICACION_HEAP, false);
        for (int i = 0; i < resHeapsort.length; i++) {
            System.out.print(resHeapsort[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con heapsort = " + clasif.estaOrdenado(resHeapsort,false));
        
        int[] vectorAleatorio6 = gdg.generarDatosAleatorios();
        int[] resSeleccion = clasif.clasificar(vectorAleatorio6,
                METODO_CLASIFICACION_SELECCION, false);
        for (int i = 0; i < resSeleccion.length; i++) {
            System.out.print(resSeleccion[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con seleccion = " + clasif.estaOrdenado(resSeleccion,false));
        
        int[] vectorAleatorio7 = gdg.generarDatosAleatorios();
        int[] resBucketsort = clasif.clasificar(vectorAleatorio7,
                METODO_CLASIFICACION_BUCKETSORT, false);
        for (int i = 0; i < resBucketsort.length; i++) {
            System.out.print(resBucketsort[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con Bucketsort = " + clasif.estaOrdenado(resBucketsort,false));
        
        int[] vectorAleatorio8 = gdg.generarDatosAleatorios();
        int[] resCuentaDistribucion = clasif.clasificar(vectorAleatorio8,
                METODO_CLASIFICACION_CUENTA_DISTRIBUCION, false);
        for (int i = 0; i < resCuentaDistribucion.length; i++) {
            System.out.print(resCuentaDistribucion[i] + " ");
        }
        System.out.println("\nEl vector esta ordenado con seleccion = " + clasif.estaOrdenado(resCuentaDistribucion,false));
        
    }

}
