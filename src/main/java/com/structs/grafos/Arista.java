package com.structs.grafos;

public class Arista
{

	private int origen;
	private int destino;
		
	
	public Arista(int origen, int destino)
	{
		super();
		this.origen = origen;
		this.destino = destino;
	}
	
	
	
	public int getOrigen()
	{
		return origen;
	}
	public void setOrigen(int origen)
	{
		this.origen = origen;
	}
	public int getDestino()
	{
		return destino;
	}
	public void setDestino(int destino)
	{
		this.destino = destino;
	}



	@Override
	public String toString()
	{
		return "Arista [origen=" + origen + ", destino=" + destino + "]";
	}
	
	
}
