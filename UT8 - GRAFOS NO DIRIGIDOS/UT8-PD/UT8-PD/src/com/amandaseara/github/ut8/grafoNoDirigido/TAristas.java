package com.amandaseara.github.ut8.grafoNoDirigido;

import java.util.Collection;
import java.util.Comparator;

import java.util.LinkedList;

/**
 *
 * @author Amanda
 */
public class TAristas extends LinkedList<TArista> {

    private final static String SEPARADOR_ELEMENTOS_IMPRESOS = "-";
    //private Collection<TArista> aristas  = new LinkedList<TArista>();

    /**
     * Busca dentro de la lista de aristas una arista que conecte a etOrigen con
     * etDestino
     *
     * @param etOrigen
     * @param etDestino
     * @return
     */
    public TArista buscar(Comparable etOrigen, Comparable etDestino) {
        return this.stream()
                .filter(tArista -> tArista.getEtiquetaOrigen().compareTo(etOrigen) == 0
                        && tArista.getEtiquetaDestino().compareTo(etDestino) == 0)
                .findAny()
                .orElse(null);
    }

    /**
     * Busca la arista de menor costo que conecte a cualquier nodo de VerticesU
     * con cualquier otro de VerticesV y cuyo costo sea el minimo
     *
     * @param VerticesU - Lista de vertices U
     * @param VerticesV - Lista de vertices V
     * @return
     */
    public TArista buscarMin(Collection<Comparable> VerticesU, Collection<Comparable> VerticesV) {
       
        //---------COMPLETAR ALGORITMO--------
        // para todo u en Vertices U
        // para todo v en Vertices V
        // tA =buscar (u, v)
        // si tA <> null y tA.costo < costoMin entonces
        // tAMin = tA y costoMin = tA.costo
        // fin para todo v
        // fin para todo u
        // devolver tAMin
        TArista min = null;
        for (Comparable etiqU : VerticesU) {
            for (Comparable etiqV : VerticesV) {
                TArista buscar = buscar(etiqU, etiqV);
                if(buscar != null && (min == null || min.getCosto() > buscar.getCosto())){
                    min = buscar;
                }
            }
        }
        return min;
    }

    public String imprimirEtiquetas() {
        if (this.isEmpty()) {
            return null;
        }
        StringBuilder salida = new StringBuilder();
        //TODO: Completar codigo que imprime todas las aristas de la lista en el siguiente formato:
        //ORIGEN - DESTINO - COSTO
        return salida.toString();
    }

    void insertarAmbosSentidos(Collection<TArista> aristas) {
        if (aristas == null) return;
        for (TArista ta : aristas) {
            this.add(ta);
            this.add(ta.aristaInversa());
        }
    }
    
    public double getCostoTotal(){
        double costo = 0;
        for (TArista tArista : this) {
            costo += tArista.getCosto();
        }
        return costo/2;
    }
    
    public void ordenarPorCosto(){
        this.sort((arista1, arista2) -> Double.compare(
                arista1.getCosto(), arista2.getCosto()));
    }

}
