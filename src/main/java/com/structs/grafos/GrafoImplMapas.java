package com.structs.grafos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.structs.grafos.aristas.Arista;
import com.structs.grafos.aristas.AristaConPeso;

/**
 * Grafo que para implementar las aristas usa un mapa de mapas 
 * mapa para ordenar los vertices origen 
 * y mapa dentro del mapa, para ordenar los vertices destino, dado un vertice origen
 * De esta manera se ahorra espacio si el grafo no es denso
 * 
 * @author vpenit
 *
 * @param <A>
 */
public class GrafoImplMapas<A extends Arista> implements GrafoAristas<A>
{

	
	protected Map<Integer,Map<Integer,/**? extends*/ A>> aristas = new HashMap<Integer,Map<Integer, A>>();
	protected boolean esValorado;
	
	int vMaxEncontradoHastaAhora=0;
	
	public void insertaArista(A a)
	{
		
		vMaxEncontradoHastaAhora = Math.max(vMaxEncontradoHastaAhora, Math.max(a.getOrigen(), a.getDestino()));
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

	public int V()
	{
		return vMaxEncontradoHastaAhora;
	}
	
	
	
	public int gradoSalida(int nodo)
	{
		Optional<Map<Integer, A>> opt = getAristasOfIndex(nodo);
		
		return opt.isPresent()? opt.get().size():-1;
	}
	
	public int gradoEntrada(int nodo)
	{
		int gradoSalida=0;
		
		for(Map<Integer, A> aris:aristas.values())
		{
		if(aris.containsKey(nodo))
			gradoSalida++;
		}
		
		return gradoSalida;
		
	}
	
	
	
	
	
}
