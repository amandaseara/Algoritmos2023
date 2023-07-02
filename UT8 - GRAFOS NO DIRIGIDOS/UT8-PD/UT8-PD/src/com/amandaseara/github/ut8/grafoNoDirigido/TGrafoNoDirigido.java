package com.amandaseara.github.ut8.grafoNoDirigido;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Amanda
 */
public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido {

    protected TAristas lasAristas = new TAristas();

    /**
     *
     * @param vertices
     * @param aristas
     */
    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
        lasAristas.insertarAmbosSentidos(aristas);

    }

    @Override
    public boolean insertarArista(TArista arista) {
        TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        boolean insertado = super.insertarArista(arista) && super.insertarArista(arInv);
        return insertado;
    }

    public TAristas getLasAristas() {
        return lasAristas;
    }

    @Override
    public TGrafoNoDirigido Prim() {
        if(!esConexo()){
            System.out.println("El grafo no es conexo! No se puede aplicar PRIM");
            return this;
        }
        
        Set<Comparable> ver = getVertices().keySet();
        LinkedList<Comparable> vertices = new LinkedList<>();
        for(Comparable v : ver){
            vertices.add(v);
        }

        //El nuevo grafo, con los mismos vertices pero un nuevo conjunto de aristas
        TGrafoNoDirigido grafo = new TGrafoNoDirigido(getVertices().values(), new TAristas());

        Comparable etiquetaOrigen = vertices.getFirst();
        vertices.remove(etiquetaOrigen);
        Collection<Comparable> origen = new LinkedList<>();
        origen.add(etiquetaOrigen);

        while (!vertices.isEmpty()) {
            //Busca la arista de menor costo
            TArista aristaMin = (TArista) lasAristas.buscarMin(origen, vertices);
            TArista arista = new TArista(aristaMin.etiquetaOrigen,aristaMin.etiquetaDestino,aristaMin.costo);
            grafo.insertarArista(arista);
            Comparable etiquetaDestino = arista.getEtiquetaDestino();
            origen.remove(etiquetaOrigen);
            origen.add(etiquetaDestino);
            vertices.remove(etiquetaDestino);
        }
        return grafo;
    }

    @Override
    public TGrafoNoDirigido Kruskal() {
        Set<Comparable> ver = getVertices().keySet();
        LinkedList<Comparable> vertices = new LinkedList<>();
        for(Comparable v : ver){
            vertices.add(v);
        }
        
        TGrafoNoDirigido grafo = new TGrafoNoDirigido(getVertices().values(), new TAristas());
        
        TAristas aristas = (TAristas) this.lasAristas.clone();
        aristas.ordenarPorCosto();

        for (TArista arista : aristas) {
            TVertice origen = grafo.getVertices().get(arista.etiquetaOrigen);
            TVertice destino = grafo.getVertices().get(arista.etiquetaDestino);
            if (!grafo.conectados(origen, destino)) {
                grafo.insertarArista(arista);
            }
        }
        return grafo;
    }    

    @Override
    public Collection<TVertice> bea(Comparable etiquetaOrigen) {
        LinkedList<TVertice> res = new LinkedList<>();
        desvisitarVertices();

        if(getVertices().containsKey(etiquetaOrigen)) {
            getVertices().get(etiquetaOrigen).bea(res);
        }
        return res;
    }

    @Override
    public LinkedList<TVertice> puntosArticulacion(Comparable etOrigen) {
        LinkedList<TVertice> verticesArticulacion = new LinkedList<>();
        desvisitarVertices();
        TVertice vertice = this.getVertices().get(etOrigen);

        if (vertice != null) {
            vertice.puntosArticulacion(verticesArticulacion, 1);
        }

        return verticesArticulacion;
    }

    @Override
    public boolean esConexo() {
        return bea().containsAll(getVertices().values());
    }
}
