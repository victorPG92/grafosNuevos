package com.structs.grafos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.structs.grafos.aristas.Arista;

/**
 * Grafo que dado unos objetos V pertenecientes al dominio de los vertices
 * podemos obtener sus indices para un grafo de indices
 * 
 * @author vpenit
 *
 * @param <V>
 * @param <A>
 */
public class GrafoEtiquetado<V ,A extends Arista>  implements GrafoAristas<A>
{

	private GrafoAristas<A> grafoAristas;
	
	private List<V> vertices = new ArrayList<V>();
	
	
	
	
	public GrafoEtiquetado(GrafoAristas<A> grafoAristas)
	{
		super();
		this.grafoAristas = grafoAristas;
	}
	
	public GrafoEtiquetado(GrafoAristas<A> grafoAristas, List<V> vertices)
	{
		super();
		this.grafoAristas = grafoAristas;
		this.vertices = vertices;
	}





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
			
			return grafoAristas.getAristaIndices(optOrigen.get(),optDestino.get() );
		}
	}

	public GrafoAristas<A> getGrafoAristas()
	{
		return grafoAristas;
	}

	public void setGrafoAristas(GrafoAristas<A> grafoAristas)
	{
		this.grafoAristas = grafoAristas;
	}

	public List<V> getVertices()
	{
		return vertices;
	}

	public void setVertices(List<V> vertices)
	{
		this.vertices = vertices;
	}

	public int V()
	{
		return grafoAristas.V();
	}

	public void insertaArista(A a)
	{
		grafoAristas.insertaArista(a);
	}

	public Optional<Map<Integer, A>> getAristasOfIndex(int v)
	{
		return grafoAristas.getAristasOfIndex(v);
	}

	public Optional<A> getAristaIndices(int origen, int destino)
	{
		return grafoAristas.getAristaIndices(origen, destino);
	}

	public int gradoEntrada(int nodo)
	{
		return grafoAristas.gradoEntrada(nodo);
	}

	public int gradoSalida(int nodo)
	{
		return grafoAristas.gradoSalida(nodo);
	}
	
	
	
	
	
	
	
	
	
	
}
