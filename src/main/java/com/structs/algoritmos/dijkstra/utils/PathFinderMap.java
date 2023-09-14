package com.structs.algoritmos.dijkstra.utils;

import java.util.List;
import java.util.Map;

/**
 * Dado un mapa de nodos desde los que venir
 * obtiene el camino 
 * @author vpenit
 *
 * @param <T>
 */
public interface PathFinderMap<T>
{

	public List<T> obtenerCamino(Map<T,T> mapa,  T destino);
	
}
