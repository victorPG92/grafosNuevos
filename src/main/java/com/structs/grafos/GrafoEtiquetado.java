package com.structs.grafos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GrafoEtiquetado<V ,A extends Arista> extends GrafoImplMapas<A>
{

	
	private List<V> vertices = new ArrayList<V>();
	
	
	public void insertaVertice(V vertice)
	{
		vertices.add(vertice);
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
