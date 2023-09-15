package com.structs.algoritmos.dijkstra;

import java.util.List;

import com.structs.grafos.GrafoEtiquetado;
import com.structs.grafos.aristas.AristaConPeso;
import com.structs.prioqueue.ColaPrioridad;
import com.structs.prioqueue.ColaPrioridadImp;
import com.structs.prioqueue.ValorObservable;

public class AlgoritmoDijkstraColaPrio<T> extends AlgoritmoDijkstraAbs<T>
{

	ColaPrioridad<ValorObservable<NodoConDistancia<Integer, NodoConDistancia<Integer, Double>>> > colaPrio 
	= new ColaPrioridadImp<ValorObservable<NodoConDistancia<Integer, NodoConDistancia<Integer, Double>>>>();
	
	
	public AlgoritmoDijkstraColaPrio(GrafoEtiquetado<T, AristaConPeso<Double>> grafo,List<Double> dists)
	{
		super(grafo);
		
		colaPrio.add(null);
	}


	@Override
	protected Integer minDistanciaNoRecorrido()
	{
		do 
		{
			ValorObservable<NodoConDistancia<Integer, NodoConDistancia<Integer, Double>>> primer = colaPrio.quitaPrimer();
			nodoActual= primer.getValor().getNodo();
		}
		while(marcado.get(nodoActual));
		
		return null;
	}
	
	/**
	protected void faseActualizacion()
	{
		super.faseActualizacion();
		colaPrio
	}
	*/
}
