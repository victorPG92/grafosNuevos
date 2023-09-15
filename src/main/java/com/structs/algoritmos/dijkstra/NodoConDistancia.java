package com.structs.algoritmos.dijkstra;

public class NodoConDistancia<V,W>
{

	V nodo;
	W peso;
	
	
	public NodoConDistancia(V nodo, W peso)
	{
		super();
		this.nodo = nodo;
		this.peso = peso;
	}
	
	
	
	
	public V getNodo()
	{
		return nodo;
	}




	public W getPeso()
	{
		return peso;
	}
	public void setPeso(W peso)
	{
		this.peso = peso;
	}
	
	
}
