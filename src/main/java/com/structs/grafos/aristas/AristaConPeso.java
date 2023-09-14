package com.structs.grafos.aristas;

/**
 * Arista que ademas de origen y destino tiene un objeto 
 * dicho objeto puede ser un peso, int double, etc
 * o puede ser una etiqueta o un conjunto de ambos.
 * @author vpenit
 *
 * @param <W>
 */
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
