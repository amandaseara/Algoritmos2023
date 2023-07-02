package com.amandaseara.github.ut8.grafoNoDirigido;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Amanda
 */
public interface IGrafoNoDirigido {

    public Collection<TVertice> bea();

    public Collection<TVertice> bea(Comparable etiquetaOrigen);

    public TGrafoNoDirigido Prim();

    public TGrafoNoDirigido Kruskal();

    public LinkedList<TVertice> puntosArticulacion(Comparable etOrigen);

    boolean esConexo();
}
