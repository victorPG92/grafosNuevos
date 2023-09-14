package com.structs.algoritmos.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.structs.grafos.GrafoAristas;
import com.structs.grafos.GrafoEtiquetado;
import com.structs.grafos.aristas.AristaConPeso;

public class AlgoritmoDijkstra<T>
{
	GrafoEtiquetado<T,AristaConPeso<Double>> grafo;
	//Map<T,T> nodoDesdeElQUeLLegar= new HashMap<T, T>();
	List<Integer> nodoDesdeElQUeLLegar= new ArrayList<Integer>();
	List<Double> distancias= new ArrayList<Double>();
	List<Boolean> marcado = new ArrayList<Boolean>();
	
	Integer nodoActual;
	Double distanciaActual;
	
	public AlgoritmoDijkstra(GrafoEtiquetado<T, AristaConPeso<Double>> grafo)
	{
		super();
		this.grafo = grafo;
	}
	
	
	public Optional<Map<T,T>> obtenerCaminoMinimo(T origen)
	{
		Optional<Integer> optV = grafo.indexOfV(origen);
		if(optV.isEmpty())
			return Optional.empty();
		
		int v=optV.get();
		inicializaDistancias(v);
		
		
		
		return null;
		
	}
	
	protected void faseActualizacion()
	{
		Optional<Map<Integer, AristaConPeso<Double>>> adys = grafo.getGrafoAristas().getAristasOfIndex(nodoActual);
		if(adys.isEmpty())
		{
			
		}
		else
		{
			
			Map<Integer, AristaConPeso<Double>> mapadys = adys.get();
			for(Entry<Integer, AristaConPeso<Double>> e:mapadys.entrySet())
			{
				
			}
		}
	}
	
	


	protected void inicializaDistancias(int origen)
	{
		nodoActual=origen;
		distanciaActual=0.0;
		for (int i = 0; i < grafo.getGrafoAristas().V(); i++) 
		{
			Double distancia=Double.MAX_VALUE;
			if(i==origen)
			{
				distancia= 0.0;
				marcado.add(true);
			}
			distancias.add(distancia);
			marcado.add(false);
		}
		
	}
}
