package com.structs.grafos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GrafoImplMapas<A extends Arista>
{

	
	protected Map<Integer,Map<Integer,/**? extends*/ A>> aristas = new HashMap<Integer,Map<Integer, A>>();
	protected boolean esValorado;
	
	
	
	public void insertaArista(A a)
	{
		// = new Arista(origen, destino);
		Map<Integer,/** ? extends*/ A> aristasdeOrigen = aristas.get(a.getOrigen());
		aristasdeOrigen.put(a.getDestino(), a);
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
	
	
	
	
	
	
	
	
	
}
