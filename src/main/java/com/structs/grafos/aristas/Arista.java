package com.structs.grafos.aristas;

/**
 * Arista que contiene origen y destino
 * @author vpenit
 *
 */
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
	
	public int getDestino()
	{
		return destino;
	}
	
	
	/**
	public void setOrigen(int origen)
	{
		this.origen = origen;
	}
	
	public void setDestino(int destino)
	{
		this.destino = destino;
	}
	*/



	@Override
	public String toString()
	{
		return "Arista [origen=" + origen + ", destino=" + destino + "]";
	}
	
	
}
