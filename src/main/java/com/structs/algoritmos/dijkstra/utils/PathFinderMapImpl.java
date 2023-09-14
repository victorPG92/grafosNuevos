package com.structs.algoritmos.dijkstra.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PathFinderMapImpl<T> implements PathFinderMap<T>
{

	public List<T> obtenerCamino(Map<T, T> mapaDesdeDondeViene,  T destino)
	{
		List<T> recorrido= new ArrayList<T>();
		
		recorrido.add(destino);
		
		T origen= mapaDesdeDondeViene.get(destino);
		while(origen!=null)
		{
			recorrido.add(0,origen);
			destino=origen;
			origen= mapaDesdeDondeViene.get(destino);
		}
		
		return recorrido;
	}

}
