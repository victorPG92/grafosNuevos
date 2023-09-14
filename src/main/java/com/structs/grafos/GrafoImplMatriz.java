package com.structs.grafos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import com.structs.grafos.aristas.Arista;
import com.structs.grafos.aristas.AristaConPeso;
import com.structs.grafos.suppliers.SuplierMatrizCuadradaVacia;

/**
 * Grafo que usa una matriz de aristas para administrar las aristas
 * de forma que en la posicion i j, puede existir la arista i j o null
 * Usado para grafos densos.
 * 
 * @author vpenit
 *
 * @param <A>
 */
public class GrafoImplMatriz<A extends Arista> implements GrafoAristas<A>
{

	int v;
	protected A[][] aristas;
	protected SuplierMatrizCuadradaVacia<A> suplierMatrizVacia; 
	protected boolean esValorado;
	
	
	public GrafoImplMatriz(int v)
	{
		this.v=v;
		aristas= suplierMatrizVacia.getMatriz(v);
		
	}	
	
	public int V()
	{
		
		return v;
	}
	
	public void insertaArista(A a)
	{
		aristas[a.getOrigen()][a.getDestino()]= a;
		
	}
		
	public Optional<Map<Integer,A>> getAristasOfIndex(int v)
	{
		Map<Integer,A> map= new HashMap<Integer, A>();
		for (int i = 0; i < v; i++) 
		{
			A a= aristas[v][i];
			if(a!=null)
			{
				map.put(i, a);
			}
		}
		
		return Optional.ofNullable(map);

		
		
	}
	
	
	public Optional<A> getAristaIndices(int origen, int destino)
	{
		if(origen>= V() || destino >=V())
		{
			return Optional.empty();
		}		
			
		return Optional.ofNullable(aristas[origen][destino]);
		
	}

	public int getV()
	{
		return v;
	}

	public void setV(int v)
	{
		this.v = v;
	}

	
	
	public int gradoSalida(int nodo)
	{
		int gradoEntrada=0;
		for (int i = 0; i < V(); i++)
		{
			if(aristas[nodo][i]!=null)
			{
				gradoEntrada++;
			}
		}
		
		return gradoEntrada;
	}
	
	public int gradoEntrada(int nodo)
	{
		int gradoEntrada=0;
		for (int i = 0; i < V(); i++)
		{
			if(aristas[i][nodo]!=null)
			{
				gradoEntrada++;
			}
		}
		
		return gradoEntrada;
	}
	
	
	
	
	
	
	
	
	
	
}
