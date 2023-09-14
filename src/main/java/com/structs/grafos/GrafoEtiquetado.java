package com.structs.grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GrafoEtiquetado<V ,A extends Arista>
{

	
	private List<V> vertices = new ArrayList<V>();
	private Map<Integer,Map<Integer,/**? extends*/ A>> aristas = new HashMap<Integer,Map<Integer, A>>();
	private boolean esValorado;
	
	public void insertaVertice(V vertice)
	{
		vertices.add(vertice);
	}
	
	public void insertaArista(A a)
	{
		// = new Arista(origen, destino);
		Map<Integer,/** ? extends*/ A> aristasdeOrigen = aristas.get(a.getOrigen());
		aristasdeOrigen.put(a.getDestino(), a);
	}
	
	
	
	
	public Optional<V> getVerticeIndice(int v)
	{
		
		if(v>=vertices.size())
		{
			return Optional.empty();
			
		}else
		{
			return Optional.ofNullable(vertices.get(v));
		}
	}
	
	public Optional<V> getVertice(V v)
	{
		Optional<Integer> opt = indexOfV(v);
		if(opt.isEmpty())
			return Optional.empty();
		else
		{
			return Optional.ofNullable(vertices.get(opt.get()));
		}
		
	}
	
	public boolean existV(V v)
	{
		return vertices.contains(v);
	}
	
	public Optional<Integer> indexOfV(V v)
	{
		if(!existV(v))
		{
			return Optional.empty();
			
		}else
		{
			return Optional.ofNullable(vertices.indexOf(v));
		}
	}
	
	public Optional<Map<Integer,A>> getAristasOfIndex(int v)
	{
		if(!aristas.containsKey(v))
		{
			return Optional.empty();
		}
		else
		{
			Map<Integer,/** ? extends*/ A> aristasdeOrigen = aristas.get(v);
		
			return Optional.ofNullable(aristasdeOrigen);
		}
	}
	
	
	public Optional<A> getAristaIndices(int origen, int destino)
	{
		
		Optional<Map<Integer, A>> aristasOrigenOpt = getAristasOfIndex(origen);
		if(aristasOrigenOpt.isEmpty())
		{
			return Optional.empty();
		}
		else
		{
			Map<Integer,/** ? extends*/ A> aristasdeOrigen = aristasOrigenOpt.get();
			if(!aristasdeOrigen.containsKey(destino))
			{
				return Optional.empty();
			}
			
			return Optional.ofNullable(aristasdeOrigen.get(destino));
		}
	}
	
	public Optional<A> getArista(V origen, V destino)
	{
		Optional<Integer> optOrigen = indexOfV(origen);
		Optional<Integer> optDestino = indexOfV(destino);
		
		
		if(optOrigen.isEmpty() || optDestino.isEmpty())
		{
			return Optional.empty();
		}
		else
		{
			
			return getAristaIndices(optOrigen.get(),optDestino.get() );
		}
	}
	
	
	
	
	
	
	
	
}
