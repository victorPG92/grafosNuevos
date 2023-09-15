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

public abstract class AlgoritmoDijkstraAbs<T>
{
	protected GrafoEtiquetado<T,AristaConPeso<Double>> grafo;
	//Map<T,T> nodoDesdeElQUeLLegar= new HashMap<T, T>();
	protected List<Integer> nodoDesdeElQUeLLegar= new ArrayList<Integer>();
	protected List<Double> distanciasOrigenANodo= new ArrayList<Double>();
	protected List<Boolean> marcado = new ArrayList<Boolean>();
	
	protected Integer nodoActual;
	protected Double distanciaAlNodoActual;
	
	public AlgoritmoDijkstraAbs(GrafoEtiquetado<T, AristaConPeso<Double>> grafo)
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
		
		while(sigaHabiendoNodosSinRecorrer())
		{
		
			faseActualizacion();
			nodoActual= minDistanciaNoRecorrido();
			distanciaAlNodoActual=distanciasOrigenANodo.get(nodoActual);
			
		}
		return null;
		
	}
	
	


	protected abstract Integer minDistanciaNoRecorrido();


	protected void faseActualizacion()
	{
		Optional<Map<Integer, AristaConPeso<Double>>> adys = grafo.getGrafoAristas().getAristasOfIndex(nodoActual);
		if(adys.isEmpty())
		{
			return ;
		}
		else
		{
			marcado.set(nodoActual, true);
			Map<Integer, AristaConPeso<Double>> mapadys = adys.get();
			for(Entry<Integer, AristaConPeso<Double>> e:mapadys.entrySet())
			{
				//int dest = e.getValue().getDestino();
				int dest = e.getKey();

			
				if(!marcado.get(dest))
				{
					double distanciaActual2Ady= e.getValue().getPeso();
					double distTentativa= distanciaAlNodoActual + distanciaActual2Ady; 
					
					double distanciaOrigenAdy = distanciasOrigenANodo.get(dest);
					
					if(distTentativa<distanciaOrigenAdy)
					{
						distanciaOrigenAdy=distTentativa;
						nodoDesdeElQUeLLegar.set(dest, nodoActual);
						
						distanciasOrigenANodo.set(dest,distanciaOrigenAdy);

					
					}
				}
			}
		}
	}
	
	


	protected void inicializaDistancias(int origen)
	{
		nodoActual=origen;
		distanciaAlNodoActual=0.0;
		for (int i = 0; i < grafo.V(); i++) 
		{
			Double distancia=Double.MAX_VALUE;
			if(i==origen)
			{
				distancia= 0.0;
				marcado.add(true);
			}
			distanciasOrigenANodo.add(distancia);
			marcado.add(false);
			nodoDesdeElQUeLLegar.add(null);
		}
		
	}
	
	
	private boolean sigaHabiendoNodosSinRecorrer()
	{
		for(Boolean b:marcado)
		{
			if(!b)
				return true;
		}
		return false;
	}
}
