package com.structs.grafos;

public class AristaConPeso<W> extends Arista
{

	private W peso;

	public AristaConPeso(int origen, int destino, W peso)
	{
		super(origen, destino);
		this.peso = peso;
	}

	public W getPeso()
	{
		return peso;
	}

	public void setPeso(W peso)
	{
		this.peso = peso;
	}

	@Override
	public String toString()
	{
		return "AristaConPeso [peso=" + peso + "]";
	}
	
	
	
}
