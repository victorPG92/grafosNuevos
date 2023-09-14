package com.structs.grafos;

import java.util.Map;
import java.util.Optional;

import com.structs.grafos.aristas.Arista;

/**
 * Grafo que tiene aristas y un numero limitado de vertices
 * 
 * @author vpenit
 *
 * @param <A>
 */
public interface GrafoAristas<A extends Arista>
{

	/**
	 * Numero de vertices
	 * @return
	 */
	int V();
	
	
	/**
	 * Inserta una arista de A tipo
	 * @param a
	 */
	void insertaArista(A a);

	
	/**
	 * Devuelve si puede un mapa de aristas dado un vertice.
	 * @param v
	 * @return
	 */
	Optional<Map<Integer, A>> getAristasOfIndex(int v);

	
	/**
	 * Devuelve la arista si existe entre los vertices origen y destino
	 * @param origen
	 * @param destino
	 * @return
	 */
	Optional<A> getAristaIndices(int origen, int destino);

}