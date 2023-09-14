package com.structs.grafos.aristas;

/**
 * Clase que se puede usar de peso que contiene un string etiqueta
 * @author vpenit
 *
 * @param <W>
 */
public class PesoConEtiqueta <W>
{

	W peso;
	String etiqueta="";
	
	
	
	
	public PesoConEtiqueta(W peso)
	{
		super();
		this.peso = peso;
	}
	public PesoConEtiqueta(W peso, String etiqueta)
	{
		super();
		this.peso = peso;
		this.etiqueta = etiqueta;
	}
	public W getPeso()
	{
		return peso;
	}
	public void setPeso(W peso)
	{
		this.peso = peso;
	}
	public String getEtiqueta()
	{
		return etiqueta;
	}
	public void setEtiqueta(String etiqueta)
	{
		this.etiqueta = etiqueta;
	}
	
	
	
}
